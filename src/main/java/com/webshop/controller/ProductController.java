package com.webshop.controller;

import com.webshop.model.ProductEntity;
import com.webshop.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list-bluecats")
    public String viewBluePage(Model model) {
        List<ProductEntity> listProducts = productService.listAll();
        model.addAttribute("listProducts", listProducts);
        return "list-bluecats";

    }
	@RequestMapping("/list-redcats")
	public String viewRedPage(Model model) {
		List<ProductEntity> listProducts1 = productService.listAll();
		model.addAttribute("listProducts", listProducts1);
		return "list-redcats";

	}

	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
        ProductEntity product = new ProductEntity();
		model.addAttribute("product", product);

		return "new_product";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") ProductEntity product) {
        productService.save(product);

		return "redirect:/ist-bluecats";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
        ProductEntity product = productService.get(id);
		mav.addObject("product", product);

		return mav;
	}

	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
        productService.delete(id);
		return "redirect:/";
	}
}



//    @PostMapping("/all")
//    public ProductEntity createProduct(@Valid @RequestBody ProductEntity product) {
//        return productRepository.save(product);
//    }
//
//    @GetMapping("/{id}")
//    public ProductEntity getProductById(@PathVariable(value = "id") Long productId) {
//        return productRepository.findById(productId)
//            .orElseThrow(() -> new ResourceNotFoundException("Product", "id", productId));
//    }
//
//
//
//    @PutMapping("/{id}")
//    public ProductEntity updateProduct(@PathVariable(value = "id") Long productId,
//                                         @Valid @RequestBody ProductEntity productDetails) {
//
//        ProductEntity product = productRepository.findById(productId)
//            .orElseThrow(() -> new ResourceNotFoundException("Product", "id", productId));
//
//        product.setName(productDetails.getName());
//        product.setDescription(productDetails.getDescription());
//        product.setPrice(productDetails.getPrice());
//        product.setCount(productDetails.getCount());
//
//
//
//
//        ProductEntity updatedProduct = productRepository.save(product);
//        return updatedProduct;
//    }
//
//    @DeleteMapping("/product/{id}")
//    public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Long productId) {
//        ProductEntity product = productRepository.findById(productId)
//            .orElseThrow(() -> new ResourceNotFoundException("Product", "id", productId));
//
//        productRepository.delete(product);
//
//        return ResponseEntity.ok().build();
//    }
//



