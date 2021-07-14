package org.apache.design.patterns.samples.abstractFactory;

import org.apache.design.patterns.samples.abstractFactory.zookeeper.ZookeeperRegistryFactory;

/**
 * 抽象工厂类
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public abstract class AbstractRegistryFactory {

    protected abstract RegistryCenter createRegistryCenter();

    protected abstract ConfigCenter createConfigCenter();

    /**
     * 根据实际情况选择不同的工厂类型
     * both registry and config
     * zookeeper
     * nacos
     * apolo
     *
     * only registry
     * eureka
     *
     * @return
     */
    static AbstractRegistryFactory getRegistryFactory(String factoryName) {
        return new ZookeeperRegistryFactory();
    }

}
