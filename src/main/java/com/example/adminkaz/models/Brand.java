package com.example.adminkaz.models;

import java.util.List;
import java.util.UUID;

public class Brand {
    protected UUID id;
    private String name;
    private List<Model> models;

    public Brand(){}

    public Brand(UUID id, String name, List<Model> models) {
        this.id = id;
        this.name = name;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
