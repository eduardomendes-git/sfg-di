/**
 * 
 */
package guru.springframework.edu.sfgdi.services;

/**
 * @author edmen
 *
 */
public class GreetingServicePrimary implements GreetingService {

	@Override
	public String greet() {
		return "Hello World - GreetingServicePrimary!!";
	}

}
