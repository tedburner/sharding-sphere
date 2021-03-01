package com.sharding.sphere.persist;

import com.sharding.sphere.domain.entity.OrderEntity;

import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:53
 * @description:
 */
public interface OrderMapper {

    /**
     * 插入数据
     *
     * @param order
     */
    void insert(OrderEntity order);

    void delete(Long orderId);

    List<OrderEntity> selectAll();


    List<OrderEntity> selectRange();
}
