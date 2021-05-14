/**
 * 
 */
package guru.springframework.edu.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author edmen
 *
 */
@ConstructorBinding
@ConfigurationProperties("guru.edu")
public class SfgConstructorConfig {

	private final String username;
	private final String password;
	private final String jdbcUrl;
	
	public SfgConstructorConfig(String username, String password, String jdbcUrl) {
		this.username = username;
		this.password = password;
		this.jdbcUrl = jdbcUrl;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the jdbcUrl
	 */
	public String getJdbcUrl() {
		return jdbcUrl;
	}
}
