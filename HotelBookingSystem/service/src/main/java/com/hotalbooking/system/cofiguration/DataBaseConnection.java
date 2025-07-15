package com.hotalbooking.system.cofiguration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableConfigurationProperties(DBConfiguration.class)
public class DataBaseConnection {
	
	@Autowired
	DBConfiguration dbConfiguration;
	
	@Bean
	public DataSource getConnection() {
		HikariConfig config = new HikariConfig();
		if("postgresql".equalsIgnoreCase(dbConfiguration.getDatabase())) {
			config.setJdbcUrl(dbConfiguration.getPostgresql().getUrl());
			config.setUsername(dbConfiguration.getPostgresql().getUsername());
			config.setPassword(dbConfiguration.getPostgresql().getPassword());
			config.setDriverClassName(dbConfiguration.getPostgresql().getDriverClassName());
			System.out.println("postgresql connection successFull");
		}
		else 	if("mysql".equalsIgnoreCase(dbConfiguration.getDatabase())) {
			config.setJdbcUrl(dbConfiguration.getSql().getUrl());
			config.setUsername(dbConfiguration.getSql().getUsername());
			config.setPassword(dbConfiguration.getSql().getPassword());
			config.setDriverClassName(dbConfiguration.getSql().getDriverClassName());
			System.out.println("mysql connection successFull");
		}
		else {
			throw new IllegalArgumentException("Unsupported active database: " + dbConfiguration.getDatabase() +
                    ". Please set 'app.database.active' to 'postgresql' or 'sqlserver'.");
        }
		return new HikariDataSource(config);
	}
	
	

}
