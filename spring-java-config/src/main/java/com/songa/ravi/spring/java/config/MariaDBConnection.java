package com.songa.ravi.spring.java.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Component
public class MariaDBConnection {
	
	private static DataSource mdbDataSource;

	public MariaDBConnection() {} 
	
	@PostConstruct 
	public void init() {
		getDataSource();
		System.out.println("Init Method Called");

		
	}
	
	public static DataSource getDataSource() {
		
		if (mdbDataSource == null) {
			
			HikariConfig hikariConfig = new HikariConfig();
//			hikariConfig.setDriverClassName("org.mariadb.jdbc.MariaDbDataSource");
			hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
			hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306");
			hikariConfig.setUsername("root");
//			hikariConfig.setPassword("");
			hikariConfig.addDataSourceProperty("cachePrepStmts", "true");
			hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250");
			hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

			mdbDataSource = new HikariDataSource(hikariConfig);
			
			System.out.println("Connection pooling established");
		}
		
		return mdbDataSource;
		
	}
	
	public static Connection getConnection() throws SQLException {
		if (mdbDataSource == null) {
			getDataSource();
		}
		return mdbDataSource.getConnection();
	}


}
