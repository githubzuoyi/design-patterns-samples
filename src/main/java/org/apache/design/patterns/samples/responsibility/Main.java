package org.apache.design.patterns.samples.responsibility;

import org.apache.design.patterns.samples.responsibility.po.AbstractFilter;
import org.apache.design.patterns.samples.responsibility.po.LoggerFilter;
import org.apache.design.patterns.samples.responsibility.po.QpsFilter;

/**
 * 责任链模式
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public class Main {

    private static AbstractFilter createFilter() {
        QpsFilter qpsfilter = new QpsFilter();
        LoggerFilter loggerfilter = new LoggerFilter();
        qpsfilter.setNextFilter(loggerfilter);
        return qpsfilter;

    }

    public static void main(String[] args) {
        AbstractFilter filter = createFilter();
        filter.doFilter();
    }

}
