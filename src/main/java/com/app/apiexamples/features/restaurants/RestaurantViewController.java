package com.app.apiexamples.features.restaurants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.app.apiexamples.data.dto.Restaurant;
import com.app.apiexamples.data.dto.RestaurantsListResponse;

@Controller
@RequestMapping("/restaurants")
public class RestaurantViewController {

    private final RestTemplate restTemplate;
    private static final String API_BASE_URL = "http://localhost:8080/api/v1";

    public RestaurantViewController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String listRestaurants(Model model) {
        RestaurantsListResponse response = restTemplate.getForObject(
            API_BASE_URL + "/restaurants", 
            RestaurantsListResponse.class
        );
        model.addAttribute("restaurants", response.getRestaurants());
        return "restaurants/list";
    }

    @GetMapping("/{id}")
    public String viewRestaurant(@PathVariable Integer id, Model model) {
        Restaurant restaurant = restTemplate.getForObject(
            API_BASE_URL + "/restaurant/" + id,
            Restaurant.class
        );
        model.addAttribute("restaurant", restaurant);
        return "restaurants/detail";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("restaurant", new Restaurant());
        return "restaurants/form";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Restaurant restaurant = restTemplate.getForObject(
            API_BASE_URL + "/restaurant/" + id,
            Restaurant.class
        );
        model.addAttribute("restaurant", restaurant);
        return "restaurants/form";
    }
} 