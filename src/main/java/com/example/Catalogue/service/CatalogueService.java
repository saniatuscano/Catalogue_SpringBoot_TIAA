package com.example.Catalogue.service;
import com.example.Catalogue.entity.Catalogue;
import com.example.Catalogue.repository.CatalogueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CatalogueService {
    @Autowired
    private CatalogueRepository repository;

    public Catalogue saveCatalogue(Catalogue catalogue){
        return repository.save(catalogue);
    }

    public List<Catalogue>getCatalogue(){
        return repository.findAll();
    }
    public Catalogue getCatalogueById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteCatalogue(int id){
        repository.deleteById(id);
        return "Catalogue deleted" +id;
    }

    public Catalogue updateCatalogue(Catalogue catalogue){
        Catalogue existingProduct=repository.findById(catalogue.getId()).orElse(null);
        existingProduct.setFname(catalogue.getFname());
        existingProduct.setDescription(catalogue.getDescription());
        return repository.save(existingProduct);
    }
}

