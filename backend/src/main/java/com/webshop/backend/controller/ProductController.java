package com.webshop.backend.controller;

import com.webshop.backend.exception.ResourceNotFoundException;
import com.webshop.backend.model.ProductEntity;
import com.webshop.backend.repository.ProductRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/all")
    public ProductEntity createProduct(@Valid @RequestBody ProductEntity product) {
        return productRepository.save(product);
    }

    @GetMapping("/{id}")
    public ProductEntity getProductById(@PathVariable(value = "id") Long productId) {
        return productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product", "id", productId));
    }



    @PutMapping("/{id}")
    public ProductEntity updateProduct(@PathVariable(value = "id") Long productId,
                                         @Valid @RequestBody ProductEntity productDetails) {

        ProductEntity product = productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product", "id", productId));

        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());




        ProductEntity updatedProduct = productRepository.save(product);
        return updatedProduct;
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Long productId) {
        ProductEntity product = productRepository.findById(productId)
            .orElseThrow(() -> new ResourceNotFoundException("Product", "id", productId));

        productRepository.delete(product);

        return ResponseEntity.ok().build();
    }
}

