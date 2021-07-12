package org.apache.design.patterns.samples.singleton;

import org.apache.design.patterns.samples.api.Driver;
import org.apache.design.patterns.samples.api.OldDriver;

/**
 * 单例设计模式
 * <p>
 * {饿汉式} 单例模式
 * <p>
 * 是否延迟初始化：否
 * 线程安全：是
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public class SingletonPattern1 {

    private static Driver driver = new OldDriver();

    public static Driver getInstance() {
        return driver;
    }
}
