/**
 * 
 */
package guru.springframework.edu.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.edu.sfgdi.datasource.FakeDatasource;
import guru.springframework.edu.sfgdi.services.GreetingServicePrimary;
import guru.springframework.edu.sfgdi.services.GreetingServiceProperty;
import guru.springframework.edu.sfgdi.services.GreetingServiceSetter;
import guru.springframework.edu.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.edu.sfgdi.services.I18nSpanishGreetingService;
import guru.springframework.edu.sfgdirepositories.EnglishGreetingRepository;
import guru.springframework.edu.sfgdirepositories.EnglishGreetingRepositoryImpl;

/**
 * @author edmen
 *
 */
@EnableConfigurationProperties(SfgConstructorConfig.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {
	
	@Bean
	FakeDatasource fakeDatasource(@Value("${guru.edu.username}") String username, 
								  @Value("${guru.edu.password}") String password, 
								  @Value("${guru.edu.jdbcurl}") String jdbcUrl) {
		
		FakeDatasource fakeDatasource = new FakeDatasource();
		fakeDatasource.setUsername(username);
		fakeDatasource.setPassword(password);
		fakeDatasource.setJdbcUrl(jdbcUrl);
		return fakeDatasource;
	}
	
	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile({"EN", "default"})
	@Bean
	I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}

	@Profile({"ES"})
	@Bean("i18nService")
	I18nSpanishGreetingService i18nSpanishService() {
		return new I18nSpanishGreetingService();
	}
	
	@Primary
	@Bean
	GreetingServicePrimary greetingServicePrimary() {
		return new GreetingServicePrimary();
	}
	
	@Bean
	GreetingServiceProperty greetingServiceProperty() {
		return new GreetingServiceProperty();
	}
	
	@Bean
	GreetingServiceSetter greetingServiceSetter() {
		return new GreetingServiceSetter();
	}
}
