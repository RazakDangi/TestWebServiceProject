package com.rad.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface StudentService {

	@WebMethod
	public String getStudentName(String Id);
}
