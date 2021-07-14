package org.apache.design.patterns.samples.builder;

/**
 * Config 对象构建器
 *
 * @author: feizuo
 * @since: 1.0.0
 */
public interface ConfigBuilder {

    /**
     * 添加默认配置源
     *
     * @return
     */
    public ConfigBuilder addDefaultConfigSources();

    public ConfigBuilder addDefaultConverters();

    public ConfigBuilder withConfigSource(ConfigSource source);

    public ConfigBuilder withConverter(Converter converter);

    public ConfigBuilder setClassLoader(ClassLoader classLoader);

    public Config build();

}
