package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class StarterController {
	private static long counter = 0;

	@Autowired
	Environment env;

	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> home() {
		++counter;
		Map<String, String> map = new HashMap<>();
		map.put("message", env.getProperty("message"));
		map.put("count", String.valueOf(counter));

		return map;

	}
}
