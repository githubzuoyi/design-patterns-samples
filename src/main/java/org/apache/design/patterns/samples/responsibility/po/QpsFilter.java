package org.apache.design.patterns.samples.responsibility.po;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class QpsFilter extends AbstractFilter {

    public QpsFilter() {
        System.out.println("filter:" + getClass().getName());
    }

    protected void doSomething() {
        System.out.println("watch applicaton qps");
    }
}
