package org.apache.design.patterns.samples.singleton;

import org.apache.design.patterns.samples.api.Driver;
import org.apache.design.patterns.samples.api.OldDriver;

/**
 * DCL 双重检测锁
 * <p>
 * lazy：yes
 * thread safe：yes
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public class SingletonPattern3 {

    private static Driver driver;

    public static Driver getInstance() {
        if (driver == null) {
            synchronized (SingletonPattern3.class) {
                if (driver == null) {
                    driver = new OldDriver();
                }
            }
        }
        return driver;
    }

}
