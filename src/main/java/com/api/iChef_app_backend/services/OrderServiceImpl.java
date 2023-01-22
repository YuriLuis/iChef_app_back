package com.api.iChef_app_backend.services;

import com.api.iChef_app_backend.models.Order;
import com.api.iChef_app_backend.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order add(Order order) {
        return orderRepository.save(order);
    }
}
