package org.apache.design.patterns.samples.iterator;

import javax.naming.OperationNotSupportedException;
import java.util.Iterator;

/**
 * 具有迭代器功能 的 数组对象
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public class ContainerCollection<T> implements ContainerIterable {

    private final int size;
    private T[] array;

    public ContainerCollection(int size) {
        this.size = size;
        array = (T[]) new Object[size];
    }

    public void init(T t) {
        for (int i = 0; i < size; i++) {
            array[i] = t;
        }
    }

    public ContainerIterator getIterator() {
        return new simpleIterator();
    }

    private class simpleIterator implements ContainerIterator {

        int index = 0;

        public boolean hasNext() {
            if (index < size) {
                return true;
            } else {
                return false;
            }
        }

        public Object next() {
            return array[index++];
        }

        public Object remove() {
            try {
                throw new OperationNotSupportedException();
            } catch (OperationNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
