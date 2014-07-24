package com.rad.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.rad.service.StudentService" ,serviceName="studentService")
public class StudentServiceImpl implements StudentService {

	@Override
	public String getStudentName(String Id) {
		
		return Id+"Razak";
	}

}
