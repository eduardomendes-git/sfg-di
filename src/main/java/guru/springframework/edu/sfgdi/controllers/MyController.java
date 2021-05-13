/**
 * 
 */
package guru.springframework.edu.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.edu.sfgdi.services.GreetingService;

/**
 * @author edmen
 *
 */
@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String greet() {
		return greetingService.greet();
	}
}
