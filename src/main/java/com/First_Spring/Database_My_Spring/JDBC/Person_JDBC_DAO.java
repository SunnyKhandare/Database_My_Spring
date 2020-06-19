package com.First_Spring.Database_My_Spring.JDBC;

import com.First_Spring.Database_My_Spring.Entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Person_JDBC_DAO {

    JdbcTemplate jdbcTemplate;

    public List<Person> find_All(){

        return jdbcTemplate.query( "SELECT * FROM PERSON" , new BeanPropertyRowMapper<Person>( Person.class ));
    }
}
