/**
 * 
 */
package guru.springframework.edu.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author edmen
 *
 */
@ConfigurationProperties("guru.edu")
@Configuration
public class SfgConfiguration {

	private String username;
	private String password;
	private String jdbcUrl;
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the jdbcUrl
	 */
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	/**
	 * @param jdbcUrl the jdbcUrl to set
	 */
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
}
