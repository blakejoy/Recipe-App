package com.bgonads.recipeapp.services;

import com.bgonads.recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
