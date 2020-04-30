package com.esi.msscolarite;

import com.esi.msscolarite.dao.EtudiantRepository;
import com.esi.msscolarite.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class MsScolariteApplication implements CommandLineRunner {

	@Autowired
	EtudiantRepository etudiantRepository;

	public static void main(String[] args) {
		SpringApplication.run(MsScolariteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		etudiantRepository.save(new Etudiant(null,"malki", Date.valueOf("1999-01-01"),"4isi",null,1L,null));
		etudiantRepository.save(new Etudiant(null,"ali", Date.valueOf("1995-08-11"),"4siw",null,2L,null));
		etudiantRepository.save(new Etudiant(null,"karim", Date.valueOf("1996-11-22"),"MatserSiC",null,1L,null));
		etudiantRepository.save(new Etudiant(null,"fouad", Date.valueOf("2000-02-15"),"MasterSiR",null,1L,null));

	}
}
