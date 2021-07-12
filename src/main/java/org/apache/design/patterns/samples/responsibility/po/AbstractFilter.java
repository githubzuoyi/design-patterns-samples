package org.apache.design.patterns.samples.responsibility.po;

/**
 * 过滤器抽象类
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public abstract class AbstractFilter {

    private AbstractFilter filter;

    public void setNextFilter(AbstractFilter filter) {
        this.filter = filter;
    }

    public void doFilter() {
        // 业务监控等处理
        doSomething();

        if (filter != null) {
            filter.doFilter();
        }
    }

    protected abstract void doSomething();
}
