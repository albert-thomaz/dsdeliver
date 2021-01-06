package com.albert.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import com.albert.dsdeliver.dto.OrderDTO;
import com.albert.dsdeliver.entities.Order;
import com.albert.dsdeliver.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> FindAll() {
        List<Order> list = repository.findOrdersWithProducts();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }
}