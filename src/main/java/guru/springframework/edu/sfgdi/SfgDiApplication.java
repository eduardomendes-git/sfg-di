package guru.springframework.edu.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.edu.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.edu.sfgdi.controllers.I18nController;
import guru.springframework.edu.sfgdi.controllers.MyController;
import guru.springframework.edu.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.edu.sfgdi.controllers.SetterInjectedController;

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
	}

}
