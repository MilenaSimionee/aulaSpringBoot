package com.Milena.aulaSpringBoot;


	spring.datasource.url=jdbc:h2:mem:testdb
	spring.datasource.driverClassName=org.h2.Driver
	spring.datasource.username=sa
	spring.datasource.password=password
	spring.h2.console.enabled=true
	spring.jpa.database-platform=org.hibernate.dialect.H2Dialect


	public static void main(String[] args) {
		SpringApplication.run(AulaSpringBootApplication.class, args);
	}



}