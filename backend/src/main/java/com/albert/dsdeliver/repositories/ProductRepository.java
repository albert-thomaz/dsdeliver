package com.albert.dsdeliver.repositories;

import java.util.List;

import com.albert.dsdeliver.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findAllByOrderByNameAsc();
}
