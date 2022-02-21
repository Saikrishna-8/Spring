package com.sai.config;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.sai.DAO.AppDAOImpl;

@Configuration
public class AppConfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://db4free.net:3306/saikrishnadb");
		dataSource.setUsername("saikrishnadb");
		dataSource.setPassword("Fassak@08");

		return dataSource;
	}
	@Bean(name="DAOBean")
	public AppDAOImpl AppDAO(){
		return new AppDAOImpl(getDataSource());
	}
}








