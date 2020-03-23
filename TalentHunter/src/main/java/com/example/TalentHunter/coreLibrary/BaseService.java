package com.example.TalentHunter.coreLibrary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService <T, U, K extends Serializable> {
//    T save(T entity);
    Optional<U> findById (K id);
//    List<T> findAll();
    long count ();
//    void delete(T entity);
    boolean existsById (K id);

    U save (U dto);

    void deleteById (K id);

    Optional<U> updateById (U dto, K id);

    Page<U> findAll (Pageable pageable);

}
