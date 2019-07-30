package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * BeanFactory级别的处理，是针对整个Bean的工厂进行处理
 */
@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {
    private static final String HANDLER_PACKAGE = "com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.biz";

    /**
     * 扫描@HandlerType，初始化HandlerContext，并将其注册到SpringIOC容器中
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Map<String,Class> handlerMap = new HashMap<String,Class>();

    }
}
