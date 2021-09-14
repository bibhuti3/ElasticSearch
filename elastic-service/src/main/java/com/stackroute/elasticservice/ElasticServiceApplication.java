package com.stackroute.elasticservice;

import com.stackroute.elasticservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackageClasses = ProductRepository.class)
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ElasticServiceApplication {



	public static void main(String[] args) {
		SpringApplication.run(ElasticServiceApplication.class, args);
	}

}
