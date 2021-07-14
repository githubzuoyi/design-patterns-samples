package org.apache.design.patterns.samples.abstractFactory.zookeeper;

import org.apache.design.patterns.samples.abstractFactory.RegistryCenter;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class ZookeeperRegistryCenter implements RegistryCenter {
    public void register() {
        System.out.println("ZookeeperRegistryCenter#register");
    }

    public void disregister() {
        System.out.println("ZookeeperRegistryCenter#disregister");
    }
}
