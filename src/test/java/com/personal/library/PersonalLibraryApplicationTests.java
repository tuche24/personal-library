package com.personal.library;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.tools.sjavac.Log;

@SpringBootTest
class PersonalLibraryApplicationTests {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Test
	void contextLoads() throws SQLException {
		
		Connection connection = dataSource.getConnection();
		System.out.println("DBCP: " + dataSource.getClass());
		System.out.println("Url: " + connection.getMetaData().getURL());
		System.out.println("UserName: " + connection.getMetaData().getUserName());
	}

}
