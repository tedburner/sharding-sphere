## 数据库分库分片
基于spring boot + sharding sphere + MyBatis 实现数据库分片。

**注意：** sharding sphere对于spring boot不支持2.x以上的版本，现在只支持1.x版本
所以在使用中请注意自己使用的 spring boot版本。

数据库语句：

```sql
## 创建数据库0
CREATE DATABASE ds0 DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_general_ci;
CREATE TABLE `t_order` (
  `order_id` bigint(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` bigint(12) DEFAULT NULL COMMENT '用户ID',
  `status` varchar(64) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE=InnoDB COMMENT '订单表';

CREATE TABLE `t_order_item` (
  `order_item_id` bigint(12) NOT NULL,
  `order_id` bigint(12) DEFAULT NULL,
  `user_id` bigint (12) DEFAULT NULL,
  `status` varchar(64) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB COMMENT '订单目录表';

## 创建数据库1
CREATE DATABASE ds1 DEFAULT CHARSET utf8mb4 COLLATE utf8mb4_general_ci;
CREATE TABLE `t_order` (
    `order_id` bigint(12) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `user_id` bigint(12) DEFAULT NULL COMMENT '用户ID',
    `status` varchar(64) NOT NULL COMMENT '订单状态',
    PRIMARY KEY (`order_id`) USING BTREE
) ENGINE=InnoDB COMMENT '订单表';

CREATE TABLE `t_order_item` (
    `order_item_id` bigint(12) NOT NULL,
    `order_id` bigint(12) DEFAULT NULL,
    `user_id` bigint (12) DEFAULT NULL,
    `status` varchar(64) NOT NULL COMMENT '订单状态',
    PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB COMMENT '订单目录表';

```