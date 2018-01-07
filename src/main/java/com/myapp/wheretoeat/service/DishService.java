package com.myapp.wheretoeat.service;

import com.myapp.wheretoeat.model.Dish;
import com.myapp.wheretoeat.repository.DishRepository;
import com.myapp.wheretoeat.util.exception.NotFoundException;

import java.util.List;

import static com.myapp.wheretoeat.util.ValidationUtil.checkNotFoundWithId;

public class DishService {

    private DishRepository repository;

    public Dish create(Dish dish) {
        return repository.save(dish);
    }

    public void delete(int id) throws NotFoundException {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public Dish get(int id) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public List<Dish> getAll(int restId) {
        return repository.getAll(restId);
    }

    public void update(Dish dish) {
        repository.save(dish);
    }
}
