package org.apache.design.patterns.samples.factory.zookeeper;

import org.apache.design.patterns.samples.factory.Registry;
import org.apache.design.patterns.samples.factory.RegistryFactory;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class ZookeeperRegistryFactory implements RegistryFactory {

    public Registry createRegistry() {
        return new ZookeeperRegistry();
    }
}
