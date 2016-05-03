package com.fsociety.api.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * service工具类
 * 
 * @author enson16855
 *
 */
public class BeanFactoryProvidor implements BeanFactoryAware {

	private static BeanFactory beanFactory  = null;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {  
    	BeanFactoryProvidor.beanFactory = beanFactory;  
    }  

	/**
	 * 通过名称获取bean
	 * 
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName) {
		return beanFactory.getBean(beanName);
	}
}
