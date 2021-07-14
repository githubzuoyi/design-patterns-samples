package org.apache.design.patterns.samples.abstractFactory.zookeeper;

import org.apache.design.patterns.samples.abstractFactory.AbstractRegistryFactory;
import org.apache.design.patterns.samples.abstractFactory.ConfigCenter;
import org.apache.design.patterns.samples.abstractFactory.RegistryCenter;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class ZookeeperRegistryFactory extends AbstractRegistryFactory {

    protected RegistryCenter createRegistryCenter() {
        return new ZookeeperRegistryCenter();
    }

    protected ConfigCenter createConfigCenter() {
        return new ZookeeperConfigCenter();
    }
}
