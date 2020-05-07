package com.webshop.controller;

import java.util.List;
import javax.validation.Valid;
import com.webshop.exception.ResourceNotFoundException;
import com.webshop.model.CategoriesEntity;
import com.webshop.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @Autowired
    CategoriesRepository categoriesRepository;

    @GetMapping("/all")
    public List<CategoriesEntity> getAllCategories() {
        return categoriesRepository.findAll();
    }


    @PostMapping("/all")
    public CategoriesEntity createCategories(@Valid @RequestBody CategoriesEntity categories) {
        return categoriesRepository.save(categories);
    }

    @GetMapping("/{id}")
    public CategoriesEntity getCategoriesById(@PathVariable(value = "id") Long categoriesId) {
        return categoriesRepository.findById(categoriesId)
            .orElseThrow(() -> new ResourceNotFoundException("Categories", "id", categoriesId));
    }



    @PutMapping("/{id}")
    public CategoriesEntity updateCategories(@PathVariable(value = "id") Long categoriesId,
                                         @Valid @RequestBody CategoriesEntity categoriesDetails) {

        CategoriesEntity categories = categoriesRepository.findById(categoriesId)
            .orElseThrow(() -> new ResourceNotFoundException("Categories", "id", categoriesId));

        categories.setName(categoriesDetails.getName());


        CategoriesEntity updatedCategories = categoriesRepository.save(categories);
        return updatedCategories;
    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<?> deleteCategories(@PathVariable(value = "id") Long categoriesId) {
        CategoriesEntity categories = categoriesRepository.findById(categoriesId)
            .orElseThrow(() -> new ResourceNotFoundException("Categories", "id", categoriesId));

        categoriesRepository.delete(categories);

        return ResponseEntity.ok().build();
    }
}

