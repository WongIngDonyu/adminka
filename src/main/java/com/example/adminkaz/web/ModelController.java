package com.example.adminkaz.web;

import com.example.adminkaz.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelController {
    private  ModelService modelService;

    @Autowired
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping("/all")
    public String showModels(Model model) {
        model.addAttribute("models", modelService.getAllModels());
        return "models";
    }
}
