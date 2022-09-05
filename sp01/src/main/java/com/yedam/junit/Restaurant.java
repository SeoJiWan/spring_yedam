package com.yedam.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	@Autowired
	Chef chef;
	private String name = "yedam";
	
	public void open() {
		chef.cook();
	}
	
	public String getName() {
		return name;
	}
	
}
