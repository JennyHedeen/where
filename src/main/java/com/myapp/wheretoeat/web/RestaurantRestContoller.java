package com.myapp.wheretoeat.web;

import com.myapp.wheretoeat.model.Restaurant;
import com.myapp.wheretoeat.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

import static com.myapp.wheretoeat.util.ValidationUtil.assureIdConsistent;
import static com.myapp.wheretoeat.util.ValidationUtil.checkNew;

public class RestaurantRestContoller {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    private RestaurantService service;


    public List<Restaurant> getAll(Date date) {
        log.info("getAll");
        return service.getAll(date);
    }

    public Restaurant get(int id) {
        log.info("get {}", id);
        return service.get(id);
    }

    public Restaurant create(Restaurant restaurant) {
        log.info("create {}", restaurant);
        checkNew(restaurant);
        return service.create(restaurant);
    }

    public void delete(int id) {
        log.info("delete {}", id);
        service.delete(id);
    }

    public void update(Restaurant restaurant, int id) {
        log.info("update {} with id={}", restaurant, id);
        assureIdConsistent(restaurant, id);
        service.update(restaurant);
    }
}
