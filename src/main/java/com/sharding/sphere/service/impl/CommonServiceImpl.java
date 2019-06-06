package com.sharding.sphere.service.impl;

import com.sharding.sphere.domain.entity.OrderEntity;
import com.sharding.sphere.domain.entity.OrderItemEntity;
import com.sharding.sphere.repository.OrderItemRepository;
import com.sharding.sphere.repository.OrderRepository;
import com.sharding.sphere.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:54
 * @description:
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;


    @Override
    public void save() {
        System.out.println("---------------------------- Insert Data ----------------------------");
        List<Long> result = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            OrderEntity order = new OrderEntity();
            order.setUserId(i);
            order.setStatus("INSERT_TEST_JPA");
            orderRepository.save(order);
            OrderItemEntity item = new OrderItemEntity();
            item.setOrderId(order.getOrderId());
            item.setUserId(i);
            item.setStatus("INSERT_TEST_JPA");
            orderItemRepository.save(item);
            result.add(order.getOrderId());
        }

    }
}
