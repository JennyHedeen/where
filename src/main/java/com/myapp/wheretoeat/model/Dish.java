package com.myapp.wheretoeat.model;

public class Dish extends AbstractEntity {

    private Double prise;

    private String description;

    private Integer restId;

    protected Dish(Integer id, String name, Double prise, String description) {
        super(id, name);
        this.prise = prise;
        this.description = description;
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRestId() {
        return restId;
    }

    public void setRestId(Integer restId) {
        this.restId = restId;
    }
}
