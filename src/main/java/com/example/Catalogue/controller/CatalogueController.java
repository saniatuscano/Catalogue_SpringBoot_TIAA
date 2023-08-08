package com.example.Catalogue.controller;

import com.example.Catalogue.entity.Catalogue;
import com.example.Catalogue.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatalogueController {

    @Autowired
    private CatalogueService service;

    @PostMapping("/addCatalogue")
    public Catalogue addCatalogue(@RequestBody Catalogue catalogue){

        return service.saveCatalogue(catalogue);
    }

    @GetMapping("/catalogues")
    public List<Catalogue> findAllCatalogue() {
        return service.getCatalogue();
    }

    @GetMapping("/catalogue/{id}")
    public Catalogue findAllCatalogueById(@PathVariable int id) {
        return service.getCatalogueById(id);
    }

    @PutMapping("/update")
    public Catalogue updateCatalogue(@RequestBody Catalogue catalogue){
        return service.updateCatalogue(catalogue);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCatalogue(@PathVariable int id){
        return service.deleteCatalogue(id);
    }

}

