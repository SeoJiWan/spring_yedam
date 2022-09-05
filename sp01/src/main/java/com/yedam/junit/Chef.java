package com.yedam.junit;

import org.springframework.stereotype.Component;

@Component
public class Chef {
	public void cook() {
		System.out.println("셰프가 요리한다");
	}
}
