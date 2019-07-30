package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy;

import com.fsw.lis.springbootlis.utils.ClassScaner;
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
        ClassScaner.scan(HANDLER_PACKAGE,HandlerType.class).forEach(clazz->{
            //获取注解中的类型值
            String type = clazz.getAnnotation(HandlerType.class).value();
            //将注解中的类型值作为key，对应的类作为value，保存在map中
            handlerMap.put(type,clazz);
        });
        //初始化HandlerContext,并注册到SpringIOC容器中
        HandlerContext context = new HandlerContext(handlerMap);
        configurableListableBeanFactory.registerSingleton(HandlerContext.class.getName(),context);
    }
}
