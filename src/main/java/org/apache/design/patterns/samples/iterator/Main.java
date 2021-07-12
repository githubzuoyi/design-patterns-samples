package org.apache.design.patterns.samples.iterator;

/**
 * iterator demo
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        ContainerCollection<String> containerCollection = new ContainerCollection<String>(10);
        containerCollection.init("hello");
        ContainerIterator iterator = containerCollection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
