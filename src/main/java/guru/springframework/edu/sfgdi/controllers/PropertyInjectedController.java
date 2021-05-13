/**
 * 
 */
package guru.springframework.edu.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.edu.sfgdi.services.GreetingService;

/**
 * @author edmen
 *
 */
@Controller
public class PropertyInjectedController {

	@Qualifier("greetingServiceProperty")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.greet();
	}
}
