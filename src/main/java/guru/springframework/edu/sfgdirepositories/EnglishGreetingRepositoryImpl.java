/**
 * 
 */
package guru.springframework.edu.sfgdirepositories;

/**
 * @author edmen
 *
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

	@Override
	public String getGreeting() {

		return "Hello World (from repository) - EN";
	}

}
