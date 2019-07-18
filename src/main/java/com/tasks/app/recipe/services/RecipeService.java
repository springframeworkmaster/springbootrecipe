package com.tasks.app.recipe.services;

import java.util.Set;

import com.tasks.app.recipe.domain.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
