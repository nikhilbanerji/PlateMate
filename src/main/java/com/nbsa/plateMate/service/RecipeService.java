package com.nbsa.plateMate.service;

import com.nbsa.plateMate.model.Recipe;
import com.nbsa.plateMate.model.RecipeResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    @Value("${spoonacular.api.key}")
    private String apiKey;
    private List<Recipe> recipes;
    private final RestTemplate restTemplate;

    public RecipeService(RestTemplate restTemplate) {
        this.recipes = new ArrayList<>();
        this.restTemplate = restTemplate;
    }

    public List<Recipe> fetchAllRecipes() {
        if (recipes.isEmpty()) {
            // Call Spoonacular API to fetch all recipes
            String apiUrl = "https://api.spoonacular.com/recipes/complexSearch?apiKey=" + apiKey + "&number=25"; // Fetch 25 recipes
            RecipeResponse recipeResponse = restTemplate.getForObject(apiUrl, RecipeResponse.class);

            // Convert JSON response to List<Recipe>
            if (recipeResponse != null && recipeResponse.getRecipes() != null) {
                recipes.addAll(recipeResponse.getRecipes());
            }
        }

        return recipes;
    }
}
