package com.nbsa.plateMate.controller;

import com.nbsa.plateMate.model.Recipe;
import com.nbsa.plateMate.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    // Endpoint to get all recipes
    @GetMapping
    public String getAllRecipes(Model model) {
        // Logic to fetch recipes (this could call a service layer)
        List<Recipe> recipes = recipeService.fetchAllServices(); // Call service to fetch all recipes
        model.addAttribute("recipes", recipes); // Add the list of recipes to the model

        // Return the name of the view template (e.g., recipes.html)
        return "recipes"; // This corresponds to a template file in src/main/resources/templates/recipes.html
    }
}
