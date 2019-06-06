package com.sharding.sphere.repository;

import com.sharding.sphere.domain.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:52
 * @description:
 */
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long> {
}
