package com.example.adminkaz.services;

import com.example.adminkaz.models.Brand;
import com.example.adminkaz.models.Model;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class BrandService {
    private final List<Brand> allBrands;

    public BrandService() {
        allBrands = initializeBrands();
    }

    private List<Brand> initializeBrands() {
        List<Brand> brands = new ArrayList<>();
        Brand brand1 = new Brand(UUID.randomUUID(),"Lada", new ArrayList<>());
        Brand brand2 = new Brand(UUID.randomUUID(),"Tesla", new ArrayList<>());
        Model model1 = new Model(UUID.randomUUID(),"Granda", Model.Category.Car, brand1);
        Model model2 = new Model(UUID.randomUUID(),"Model Z", Model.Category.Motorcycle, brand2);
        brand1.getModels().add(model1);
        brand2.getModels().add(model2);
        brands.add(brand1);
        brands.add(brand2);
        return brands;
    }

    public List<Brand> getAllBrands() {
        return allBrands;
    }
}
