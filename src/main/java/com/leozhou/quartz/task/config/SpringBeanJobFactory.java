package com.leozhou.quartz.task.config;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.AdaptableJobFactory;

/**
 * Created by zhouchunjie on 16/3/28.
 */
public class SpringBeanJobFactory extends AdaptableJobFactory implements ApplicationContextAware {

    ApplicationContext context;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object jobInstance = super.createJobInstance(bundle);
        //获取new job受理后,从上下文注册业务bean
        context.getAutowireCapableBeanFactory().autowireBeanProperties(jobInstance, 1, false);
        return jobInstance;
    }
}
