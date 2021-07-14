package org.apache.design.patterns.samples.abstractFactory.zookeeper;

import org.apache.design.patterns.samples.abstractFactory.ConfigCenter;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class ZookeeperConfigCenter implements ConfigCenter {
    public void addConfig() {
        System.out.println("ZookeeperConfigCenter#ConfigCenter");
    }

    public Object getValue(String name) {
        System.out.println("ZookeeperConfigCenter#getValue");
        return null;
    }
}
