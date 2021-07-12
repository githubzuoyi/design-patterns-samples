package org.apache.design.patterns.samples.iterator;

import java.util.Iterator;

/**
 *
 * 拥有迭代能力
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public interface ContainerIterable {

    ContainerIterator getIterator();

}
