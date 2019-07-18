package com.tasks.app.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tasks.app.recipe.domain.UnitOfMeasure;

import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
