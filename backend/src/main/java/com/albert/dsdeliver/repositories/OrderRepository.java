package com.albert.dsdeliver.repositories;

import com.albert.dsdeliver.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Product, Long> {

}
