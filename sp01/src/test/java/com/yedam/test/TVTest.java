package com.yedam.test;

import org.junit.Test;
import com.yedam.spring.SamsungTV;
import com.yedam.spring.TV;

public class TVTest {
	
	@Test
	public void tvTest() {
		TV tv = new SamsungTV();
		tv.on();
	}
	
	@Test
	public void method() {
		System.out.println("test");
	}

}
