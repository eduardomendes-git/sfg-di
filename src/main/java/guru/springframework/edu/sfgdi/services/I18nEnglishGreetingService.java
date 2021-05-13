/**
 * 
 */
package guru.springframework.edu.sfgdi.services;

import guru.springframework.edu.sfgdirepositories.EnglishGreetingRepository;

/**
 * @author edmen
 *
 */
public class I18nEnglishGreetingService implements GreetingService {

	private final EnglishGreetingRepository englishGreetingRepository;
	
	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		this.englishGreetingRepository = englishGreetingRepository;
	}
	
	@Override
	public String greet() {

		return englishGreetingRepository.getGreeting();
	}

}
