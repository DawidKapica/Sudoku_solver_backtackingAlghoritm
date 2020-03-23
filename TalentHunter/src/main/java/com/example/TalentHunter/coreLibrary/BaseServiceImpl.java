package com.example.TalentHunter.coreLibrary;

import com.searchapp.entity.RegionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public abstract class BaseServiceImpl <T, U extends BaseDto, K extends Serializable> implements BaseService<T, U, K> {

    protected BaseRepository<T, K> repository;
    protected BaseMapper<U, T> mapper;

    public BaseServiceImpl(BaseRepository<T, K> repository, BaseMapper<U, T> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

//    @Override
//    public T save(T entity) {
//        return (T) repository.save(entity);
//    }
//
//
//
//    @Override
//    public Optional<T> findById(Long id) {
////        return (T) repository.findById(id);
//        Optional<T> entityOptional = repository.findById(id);
//        return entityOptional;
//    }
//
//    @Override
//    public List<T> findAll() {
//        List<T> list = repository.findAll();
//        return list;
//    }
//
    @Override
    public long count() {
        return repository.count();
    }
//
//    @Override
//    public void delete(T entity) {
//        repository.delete(entity);
//    }
//
    @Override
    public boolean existsById(K id) {
        return repository.existsById(id);
    }



    @Override
    public U save(U dto) {
        T savedEntity = repository.save(mapper.mapToEntity(dto));

        return mapper.mapToDto(savedEntity);
    }

    @Override
    public void deleteById(K id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<U> updateById(U dto, K id) {
        Optional<T> entityOptional = repository.findById(id);

        return entityOptional.map(
                entity -> {
                    dto.setId(id);
                    repository.save(mapper.mapToEntity(dto));
                    return mapper.mapToDto(entity);
                });
    }

    @Override
    public Page<U> findAll(Pageable pageable) {
        Page<T> allEntities = repository.findAll(pageable);

        return allEntities.map(mapper::mapToDto);
    }

    @Override
    public Optional<U> findById(K id) {
        Optional<T> entityOptional = repository.findById(id);

        return entityOptional.map(mapper::mapToDto);
    }
}
