/**
 * 
 */
package guru.springframework.edu.sfgdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.edu.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.edu.sfgdi.services.GreetingServiceConstructor;

/**
 * @author edmen
 *
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new GreetingServiceConstructor());
	}

	@Test
	void test() {
		System.out.println("Constructor Injected: " + controller.getGreeting());
	}

}
