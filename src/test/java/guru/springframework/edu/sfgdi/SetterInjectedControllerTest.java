/**
 * 
 */
package guru.springframework.edu.sfgdi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.edu.sfgdi.controllers.SetterInjectedController;
import guru.springframework.edu.sfgdi.services.GreetingServiceConstructor;

/**
 * @author edmen
 *
 */
class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceConstructor());
	}

	@Test
	void test() {
		System.out.println("Setter Injected: " + controller.getGreeting());
	}

}
