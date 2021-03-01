package com.sharding.sphere.repository;

import com.sharding.sphere.domain.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lingjun.jlj
 * @date: 2021/3/1 10:47
 * @description:
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
