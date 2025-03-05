package com.example.filRougeCICD;

import org.springframework.boot.SpringApplication;

public class TestFilRougeCicdApplication {

	public static void main(String[] args) {
		SpringApplication.from(FilRougeCicdApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
