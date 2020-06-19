package com.First_Spring.Database_My_Spring;

import com.First_Spring.Database_My_Spring.Entities.Person;
import com.First_Spring.Database_My_Spring.JDBC.Person_JDBC_DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseMySpringApplication implements CommandLineRunner{

	@Autowired
	Person_JDBC_DAO person_jdbc_dao;

	public static void main(String[] args) {

		SpringApplication.run(DatabaseMySpringApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println( person_jdbc_dao.find_All() );
	}
}
