package guru.springframework.edu.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.edu.sfgdi.config.SfgConfiguration;
import guru.springframework.edu.sfgdi.config.SfgConstructorConfig;
import guru.springframework.edu.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.edu.sfgdi.controllers.I18nController;
import guru.springframework.edu.sfgdi.controllers.MyController;
import guru.springframework.edu.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.edu.sfgdi.controllers.SetterInjectedController;
import guru.springframework.edu.sfgdi.datasource.FakeDatasource;
import guru.springframework.edu.sfgdi.services.PrototypeBean;
import guru.springframework.edu.sfgdi.services.SingletonBean;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("I18nController : " + i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("MyController : " + myController.greet());
		
		System.out.println("----- Property -----");
		
		PropertyInjectedController pController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("PropertyInjected : " + pController.getGreeting());
		
		System.out.println("----- Setter -----");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("SetterInjected : " + setterInjectedController.getGreeting());
		
		System.out.println("----- Constructor -----");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("ConstructorInjected : " + constructorInjectedController.getGreeting());
		
		System.out.println("---------- Bean Scopes --------");
		
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());
		
		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());
		
		System.out.println("---------- Properties injection - Datasource example --------");
		FakeDatasource fakeDatasource = ctx.getBean(FakeDatasource.class);
		System.out.println("username=" + fakeDatasource.getUsername());
		System.out.println("password=" + fakeDatasource.getPassword());
		System.out.println("jdbc url=" + fakeDatasource.getJdbcUrl());
		
		System.out.println("---------- Properties injection - Properties Binding --------");
		SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
		System.out.println("Username=" + sfgConfiguration.getUsername());
		System.out.println("Password=" + sfgConfiguration.getPassword());
		System.out.println("JdbcUrl=" + sfgConfiguration.getJdbcUrl());
		
		System.out.println("---------- Properties injection - Constructor Properties Binding --------");
		SfgConstructorConfig sfgConstructorConfig = ctx.getBean(SfgConstructorConfig.class);
		System.out.println("Username=" + sfgConstructorConfig.getUsername());
		System.out.println("Password=" + sfgConstructorConfig.getPassword());
		System.out.println("JdbcUrl=" + sfgConstructorConfig.getJdbcUrl());
		
	}

}
