package com.sharding.sphere.domain.entity;

import com.sharding.sphere.constant.Constants;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/6 11:52
 * @description:
 */
@Data
@Entity
@Table(name = Constants.TABLE_NAME_ORDER)
@EntityListeners(AuditingEntityListener.class)
public class OrderEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = Constants.TABLE_ORDER_COLUMN_ORDER_ID)
    private Long orderId;

    private Integer userId;

    private String status;

}
