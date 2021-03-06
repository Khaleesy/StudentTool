package app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/***
 * Class using to configure connection with database needed to authentication
 * during logging to system using hibernate and spring.
 * 
 * @author Mateusz Mucha
 *
 */
@Configuration
@ComponentScan(basePackages = { "app.controller", "app.services" })
public class MvcConfig extends WebMvcConfigurerAdapter {
	/***
	 * Method as bean, gets data source of using database.
	 * 
	 * @return data source of using database
	 */
	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/Student_Tool");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");

		return driverManagerDataSource;
	}
}