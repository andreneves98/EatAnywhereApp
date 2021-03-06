package com.example.eatanywhere.model.restaurants;

import java.io.Serializable;
import java.util.List;

public class ApiResponse implements Serializable {
    private String results_found;
    private String results_start;
    private String results_shown;
    private List<Restaurant> restaurants;

    public ApiResponse(String results_found, String results_start, String results_shown, List<Restaurant> restaurants) {
        this.results_found = results_found;
        this.results_start = results_start;
        this.results_shown = results_shown;
        this.restaurants = restaurants;
    }

    public String getResults_found() {
        return results_found;
    }

    public String getResults_start() {
        return results_start;
    }

    public String getResults_shown() {
        return results_shown;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}