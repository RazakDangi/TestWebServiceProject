package com.rad.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/client-test.xml")
public class WebServiceClient {
	
	@Autowired
	@Qualifier("studentClient")
	private StudentService  service;
	
	@Test
	public void testWebService(){
		
		System.out.println(service.getStudentName("Hello"));
	}

}
