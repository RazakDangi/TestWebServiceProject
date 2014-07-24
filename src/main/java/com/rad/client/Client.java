package com.rad.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rad.service.StudentService;

public class Client {
	
	
	 public static void main(String args[]) throws Exception {
		 	        // START SNIPPET: client
		         ClassPathXmlApplicationContext  context 
		 	            = new ClassPathXmlApplicationContext(new String[] {"WEB-INF/client-bean.xml"});
		 	
		         StudentService  client = (StudentService)context.getBean("studentClient");
		 	
		 	        String response = client.getStudentName("Hello ");
		 	        System.out.println("Response: " + response);
		 	        System.exit(0);
		 	        // END SNIPPET: client
		 	    }

}
