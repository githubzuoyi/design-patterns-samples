package org.apache.design.patterns.samples.singleton;

import org.apache.design.patterns.samples.api.Driver;
import org.apache.design.patterns.samples.api.OldDriver;

/**
 * {懒汉式} 单例模式
 * <p>
 * lazy : yes
 * thread safe ： no
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public class SingletonPattern2 {

    private static Driver driver;

    public static Driver getInstance() {
        if (driver != null) {
            driver = new OldDriver();
        }
        return driver;
    }

}
