package com.bgonads.recipeapp.repositories;

import com.bgonads.recipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
