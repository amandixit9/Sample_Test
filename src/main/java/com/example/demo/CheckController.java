package com.example.demo;

public class CheckController {
@GetMapping("/hello")
	public String sayHello() {
		return "hello this running";
	}
}
