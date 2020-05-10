//package com.webshop.service;
//
//import java.util.List;
//import com.webshop.model.Product;
//import com.webshop.repository.TestProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@Transactional
//public class TestProductService {
//
//	@Autowired
//	private TestProductRepository repo;
//
//	public List<Product> listAll() {
//		return repo.findAll();
//	}
//
//	public void save(Product product) {
//		repo.save(product);
//	}
//
//	public Product get(long id) {
//		return repo.findById(id).get();
//	}
//
//	public void delete(long id) {
//		repo.deleteById(id);
//	}
//}
