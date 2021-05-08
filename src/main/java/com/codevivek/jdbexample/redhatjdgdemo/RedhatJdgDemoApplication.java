package com.codevivek.jdbexample.redhatjdgdemo;

import com.codevivek.jdbexample.redhatjdgdemo.caching.DataGridCacheHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedhatJdgDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(RedhatJdgDemoApplication.class, args);
		DataGridCacheHelper.initCache();
	}
}

