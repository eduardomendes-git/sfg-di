/**
 * 
 */
package guru.springframework.edu.sfgdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author edmen
 *
 */
@Component
public class LifeCycleDemoBean
		implements InitializingBean, 
				   DisposableBean, 
				   BeanNameAware, 
				   BeanFactoryAware, 
				   ApplicationContextAware {
	
	public LifeCycleDemoBean() {
		System.out.println("### LifeCycleDemoBean Constructor!");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("### LifeCycleDemoBean setApplicationContext() - Application Context has been set!");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("### LifeCycleDemoBean setBeanFactory() - Bean Factory has been set!");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("### LifeCycleDemoBean setBeanName() - Bean Name has been set!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("### LifeCycleDemoBean destroy() - Life Cycle terminated!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("### LifeCycleDemoBean afterPropertiesSet() - Life Cycle properties set!");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("### LifeCycleDemoBean post construct annotated method has been called!");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("### LifeCycleDemoBean pre destroy annotated method has been called!");
	}
	
	public void beforeInit() {
		System.out.println("### LifeCycleDemoBean beforeInit() method has been called!");
	}
	
	public void afterInit() {
		System.out.println("### LifeCycleDemoBean afterInit() method has been called!");
	}
}
