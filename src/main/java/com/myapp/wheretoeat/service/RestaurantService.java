package com.myapp.wheretoeat.service;

import com.myapp.wheretoeat.model.Restaurant;
import com.myapp.wheretoeat.repository.RestaurantRepository;
import com.myapp.wheretoeat.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.myapp.wheretoeat.util.ValidationUtil.checkNotFoundWithId;


@Service
public class RestaurantService {

//    @Autowired
    private RestaurantRepository repository;

    public Restaurant create(Restaurant dish) {
        return repository.save(dish);
    }

    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public Restaurant get(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public List<Restaurant> getAll(Date date) {
        return repository.getAll(date);
    }

    public void update(Restaurant restaurant) {
        repository.save(restaurant);
    }
}
