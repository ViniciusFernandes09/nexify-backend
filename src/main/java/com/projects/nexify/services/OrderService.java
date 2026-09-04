package com.projects.nexify.services;

import com.projects.nexify.dto.OrderDTO;
import com.projects.nexify.dto.ProductDTO;
import com.projects.nexify.entities.Order;
import com.projects.nexify.entities.Product;
import com.projects.nexify.repositories.OrderRepository;
import com.projects.nexify.repositories.ProductRepository;
import com.projects.nexify.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
