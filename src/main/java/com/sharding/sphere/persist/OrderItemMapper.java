package com.sharding.sphere.persist;

import com.sharding.sphere.domain.entity.OrderItemEntity;

import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:52
 * @description:
 */
public interface OrderItemMapper {

    /**
     * 插入数据
     *
     * @param orderItemEntity
     */
    void insert(OrderItemEntity orderItemEntity);

    void delete(Long orderId);

    List<OrderItemEntity> selectAll();


    List<OrderItemEntity> selectRange();
}
