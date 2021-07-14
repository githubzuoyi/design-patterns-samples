package org.apache.design.patterns.samples.abstractFactory;

/**
 * 产品 ： 配置中心
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public interface ConfigCenter {

    void addConfig();

    Object getValue(String name);

}
