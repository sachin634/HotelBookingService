package com.hotalbooking.system.cofiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="app.database")
public class DBConfiguration {

	private String database ;
	private Postgresql postgresql = new Postgresql();
	private Sql sql = new Sql();
	
	 
	
	
	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public Postgresql getPostgresql() {
		return postgresql;
	}

	public void setPostgresql(Postgresql postgresql) {
		this.postgresql = postgresql;
	}

	public Sql getSql() {
		return sql;
	}

	public void setSql(Sql sql) {
		this.sql = sql;
	}

	public static class Postgresql{
		String url;
		String username;
		String password;
		String driverClassName;
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDriverClassName() {
			return driverClassName;
		}
		public void setDriverClassName(String driverClassName) {
			this.driverClassName = driverClassName;
		}
		
	}
	
	public static class Sql{
		String url;
		String username;
		String password;
		String driverClassName;
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getDriverClassName() {
			return driverClassName;
		}
		public void setDriverClassName(String driverClassName) {
			this.driverClassName = driverClassName;
		}
	}
	
}
