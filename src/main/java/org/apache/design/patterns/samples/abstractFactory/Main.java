package org.apache.design.patterns.samples.abstractFactory;

/**
 * demo
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        AbstractRegistryFactory factory = AbstractRegistryFactory.getRegistryFactory("zookeeper");
        ConfigCenter configCenter = factory.createConfigCenter();
        configCenter.addConfig();
        configCenter.getValue("server.port");
    }
}
