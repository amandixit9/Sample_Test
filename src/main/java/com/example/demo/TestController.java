package com.example.demo;

public class TestController {
@GetMapping("/hello")
	public String sayHello() {
		return "hello this running";
	}
}
