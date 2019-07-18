package com.tasks.app.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tasks.app.recipe.domain.Recipe;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
