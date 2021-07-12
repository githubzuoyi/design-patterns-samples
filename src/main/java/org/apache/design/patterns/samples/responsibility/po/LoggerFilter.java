package org.apache.design.patterns.samples.responsibility.po;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
public class LoggerFilter extends AbstractFilter{

    public LoggerFilter() {
        System.out.println("filter:" + getClass().getName());
    }

    protected void doSomething() {
        System.out.println("loggerSometing");
    }
}
