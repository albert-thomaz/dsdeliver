package com.albert.dsdeliver.controllers;

import java.util.List;

import com.albert.dsdeliver.dto.ProductDTO;
import com.albert.dsdeliver.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired 
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<ProductDTO> list = service.FindAll();
        return ResponseEntity.ok().body(list);
    }
}
