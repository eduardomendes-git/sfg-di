/**
 * 
 */
package guru.springframework.edu.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author edmen
 *
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

	@Override
	public String greet() {

		return "Hola Mundo - ES";
	}

}
