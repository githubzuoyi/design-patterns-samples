package org.apache.design.patterns.samples.iterator;

/**
 *
 * 迭代器 iterator
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public interface ContainerIterator {

    boolean hasNext();

    Object next();

    Object remove();

}
