package com.esi.msformation;

import com.esi.msformation.dao.FormationRepository;
import com.esi.msformation.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsFormationApplication implements CommandLineRunner {

	@Autowired
	FormationRepository formationRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MsFormationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repositoryRestConfiguration.exposeIdsFor(Formation.class);

		Formation f1=  formationRepository.save(new Formation(null, "Java",30));
		Formation f2=formationRepository.save(new Formation(null, "Angular",40));

	}
}
