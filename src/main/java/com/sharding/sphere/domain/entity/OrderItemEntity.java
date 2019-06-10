package com.sharding.sphere.domain.entity;

import lombok.Data;

@Data
public class OrderItemEntity{


    private Long orderItemId;

    private Long orderId;

    private Integer userId;

    private String status;

}
