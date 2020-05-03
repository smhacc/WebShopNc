package com.webshop.backend.controller;

import com.webshop.backend.exception.ResourceNotFoundException;
import com.webshop.backend.model.CategoriesEntity;
import com.webshop.backend.repository.CategoriesRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

