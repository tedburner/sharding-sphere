package com.sharding.sphere.service.impl;

import com.sharding.sphere.domain.entity.OrderEntity;
import com.sharding.sphere.domain.entity.OrderItemEntity;
import com.sharding.sphere.persist.OrderItemMapper;
import com.sharding.sphere.persist.OrderMapper;
import com.sharding.sphere.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:54
 * @description:
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private OrderItemMapper orderItemMapper;


    @Override
    public void save() {
        System.out.println("---------------------------- Insert Data ----------------------------");
        List<Long> result = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            OrderEntity order = new OrderEntity();
            order.setUserId(i);
            order.setStatus("INSERT_TEST_JPA");
            orderMapper.insert(order);
            OrderItemEntity item = new OrderItemEntity();
            item.setOrderId(order.getOrderId());
            item.setUserId(i);
            item.setStatus("INSERT_TEST_JPA");
            orderItemMapper.insert(item);
            result.add(order.getOrderId());
        }

    }

    @Override
    public List<OrderEntity> findSomeOne() {
        return orderMapper.selectAll();
    }
}
