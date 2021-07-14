package org.apache.design.patterns.samples.abstractFactory.otherFactory;

import org.apache.design.patterns.samples.abstractFactory.AbstractRegistryFactory;
import org.apache.design.patterns.samples.abstractFactory.ConfigCenter;
import org.apache.design.patterns.samples.abstractFactory.RegistryCenter;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class EurekaRegistryFactory extends AbstractRegistryFactory {

    /**
     * 仅支持注册中心
     * @return
     */
    protected RegistryCenter createRegistryCenter() {
        return null;
    }

    // 不支持此方法
    protected ConfigCenter createConfigCenter() {
        return null;
    }
}
