package com.tasks.app.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tasks.app.recipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
