/**
 * 
 */
package guru.springframework.edu.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.edu.sfgdi.services.GreetingService;

/**
 * @author edmen
 *
 */
@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("greetingServiceConstructor") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.greet();
	}
}
