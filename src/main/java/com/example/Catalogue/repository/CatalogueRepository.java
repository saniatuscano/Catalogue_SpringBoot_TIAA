package com.example.Catalogue.repository;
import com.example.Catalogue.entity.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue,Integer> {
}

