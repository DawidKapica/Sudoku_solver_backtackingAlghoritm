package com.example.TalentHunter.coreLibrary;

import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriTemplate;


import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
@Validated
public abstract class BaseRestController<T extends BaseDto, U, K extends Serializable> {
    protected static final String ENTITY_EXISTS_EXCEPTION_MSG = "Entity already exists with id=";
    protected static final String ENTITY_NOT_FOUND_EXCEPTION_MSG = "Entity not found with id=";
    protected static final String NOT_FOUND_EXCEPTION_MSG = "Entity not found with id=";

//    @Autowired
    public BaseRestController(BaseService service) {
        this.service = service;
    }
    protected BaseService<U, T, K> service;

    @PostMapping
    public ResponseEntity<T> create(@Valid @RequestBody T dto, HttpServletRequest request) {
//        if (service.existsById(dto.getId())) {
//            throw new EntityExistsException(ENTITY_EXISTS_EXCEPTION_MSG + dto.getId());
//        }

        T savedEntity = service.save(dto);
        final URI entityMapping =
                new UriTemplate(request.getRequestURI() + RestMappings.ID).expand(savedEntity.getId());

        return ResponseEntity.created(entityMapping).body(savedEntity);
    }

    @DeleteMapping(RestMappings.ID)
    public void deleteById(@PathVariable K id) {
        if (!service.existsById(id)) {
            throw new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION_MSG + id);
        }

        service.deleteById(id);
    }

    @GetMapping("/delete"+RestMappings.ID)
    public void deleteById_admin(@PathVariable K id) {
        if (!service.existsById(id)) {
            throw new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION_MSG + id);
        }

        service.deleteById(id);
    }

//    @Validated(OnPut.class)
    @PutMapping(RestMappings.ID)
    public T updateById(@Valid @RequestBody T dto, @PathVariable K id) {
        T responseDto;

        if (service.existsById(id)) {
            dto.setId(id);
            responseDto = service.save(dto);
        } else {
            throw new EntityNotFoundException("NotFound" + id);
        }

        return responseDto;
    }

    @GetMapping(RestMappings.ID)
    public Optional<T> getById(@RequestParam K id) {
        return service
                .findById(id);
    }

//    @GetMapping
//    public List<T> getAll() {
//    return service
//            .findAll();
//    }

    @GetMapping
    public Page<T> getAll(Pageable pageable) {
        return service.findAll(pageable);
    }


}
