package com.myapp.wheretoeat.repository;

import com.myapp.wheretoeat.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public class RestaurantRepository {

    public Restaurant save(Restaurant restaurant) {
        return null;
    }

    public boolean delete(int id) {
        return false;
    }

    public Restaurant get(int id) {
        return null;
    }

    public List<Restaurant> getAll(Date date) {
        return null;
    }

}
