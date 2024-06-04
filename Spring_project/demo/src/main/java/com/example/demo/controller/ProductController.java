package com.example.demo.controller;

import com.example.demo.dto.ProductContainer;
import com.example.demo.dto.ProductDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @Autowired
    IProductService productService;

    @RequestMapping("/products")
    public ResponseEntity<Object> getProducts(){
        System.out.println("Service Autowired: "+ productService.hashCode());
        ProductContainer productDtoAutowire = productService.getAllProducts();
        return ResponseEntity.ok(productDtoAutowire);
    }
}
