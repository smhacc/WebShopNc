package com.webshop.service;

import com.webshop.model.Product;
import com.webshop.model.ProductEntity;
import com.webshop.repository.ProductRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> listAll() {
        return productRepository.findAll();
    }

    public void save(ProductEntity product) {
        productRepository.save(product);
    }

    public ProductEntity get(long id) {
        return productRepository.findById(id).get();
    }

    public void delete(long id) {
        productRepository.deleteById(id);
    }
}