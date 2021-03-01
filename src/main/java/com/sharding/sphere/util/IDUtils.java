package com.sharding.sphere.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * @author: lingjun.jlj
 * @date: 2021/3/1 11:28
 * @description: 基于 Sharding Sphere 主键生成器
 */
@Slf4j
public class IDUtils implements ShardingKeyGenerator {
    @Override
    public Comparable<?> generateKey() {
        log.info("-----执行自定义主键生成器-----");
        return new SnowflakeShardingKeyGenerator().generateKey();
    }

    @Override
    public String getType() {
        return "TEST";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
