package com.myapp.wheretoeat.model;

import java.util.Date;
import java.util.List;

public class Restaurant extends AbstractEntity {

    private Date date;

    private List<Dish> dishes;

    protected Restaurant(Integer id, String name, List<Dish> dishes, Date date) {
        super(id, name);
        this.dishes = dishes;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
