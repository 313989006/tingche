package com.soph.tingche;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soph.tingche.mapper")
public class TingcheApplication {

	public static void main(String[] args) {
		SpringApplication.run(TingcheApplication.class, args);
	}

}
