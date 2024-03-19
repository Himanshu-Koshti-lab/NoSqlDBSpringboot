package com.SpringDataWithNoSQL.SpringNoSQLDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class SpringNoSqldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNoSqldbApplication.class, args);
	}

}
