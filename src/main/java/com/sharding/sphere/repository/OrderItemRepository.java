package com.sharding.sphere.repository;

import com.sharding.sphere.domain.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lingjun.jlj
 * @date: 2021/3/1 10:47
 * @description:
 */
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long> {
}
