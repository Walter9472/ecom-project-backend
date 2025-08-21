package com.walter.ecom_proj.controller;

import com.walter.ecom_proj.model.Product;
import com.walter.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {


    private ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();

    }

    @GetMapping("/product/{Id}")
    public Product getProduct(@PathVariable int Id){
        return service.getProductById(Id);
    }
}
