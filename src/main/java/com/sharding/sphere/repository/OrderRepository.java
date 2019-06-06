package com.sharding.sphere.repository;

import com.sharding.sphere.domain.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:53
 * @description:
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
