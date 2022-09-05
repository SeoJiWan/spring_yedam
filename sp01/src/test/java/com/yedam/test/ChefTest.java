package com.yedam.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.yedam.junit.Restaurant;

@RunWith(SpringJUnit4ClassRunner.class)
// classpath -> src/main/resources
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ChefTest {
	
	@Autowired
	ApplicationContext ac;
	@Autowired
	Restaurant rs;
	
	@Test
	public void beanTest() {
//		Restaurant rs = ac.getBean(Restaurant.class);
		assertEquals(rs, ac.getBean(Restaurant.class));
		rs.open();
	}
	
	@Test
	public void nameSameTest() {
		Restaurant rs = ac.getBean(Restaurant.class);
		assertEquals(rs.getName(), "yedam");
		
	}
}
