package com.webshop.service;

import com.webshop.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService implements ICategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

}