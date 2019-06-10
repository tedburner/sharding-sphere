package com.sharding.sphere.service;

import com.sharding.sphere.domain.entity.OrderEntity;

import java.util.List;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:54
 * @description:
 */
public interface CommonService {

    void save();

    List<OrderEntity> findSomeOne();
}
