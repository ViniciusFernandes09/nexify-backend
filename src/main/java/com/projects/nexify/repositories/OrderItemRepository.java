package com.projects.nexify.repositories;

import com.projects.nexify.entities.Order;
import com.projects.nexify.entities.OrderItem;
import com.projects.nexify.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
