/**
 * 
 */
package guru.springframework.edu.sfgdi;

import guru.springframework.edu.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.edu.sfgdi.services.GreetingServiceConstructor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author edmen
 *
 */
public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceConstructor();
	}

	@Test
	public void getGreeting() {
		System.out.println("Property Injected: " + controller.getGreeting());
	}

}
