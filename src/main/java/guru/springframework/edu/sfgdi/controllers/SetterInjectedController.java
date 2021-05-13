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
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.greet();
	}
	
	/**
	 * @param greetingService the greetingService to set
	 */
	@Autowired
	public void setGreetingService(@Qualifier("greetingServiceSetter") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
