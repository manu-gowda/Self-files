package com.xworkz.maven.configuration;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.maven.things.Movie;

@Configuration
	public class MovieRunner {

		public static void main(String[] args) {

			ApplicationContext container=new AnnotationConfigApplicationContext(MovieConfiguration.class);
			System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

			Movie movie=container.getBean(Movie.class);

		}

	}


