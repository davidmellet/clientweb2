package com.howtodoinjava.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.howtodoinjava.demo.model.EmployeeListVO;
import com.howtodoinjava.demo.model.EmployeeVO;

public class Client {
	
	private static void getEmployees2()
	{
	    final String uri = "http://localhost:8080/springrestexample/employees.xml";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    System.out.println(result);
	}
	
	private static void getEmployees()
	{
	    final String uri = "http://localhost:8080/springrestexample/employees";
	    RestTemplate restTemplate = new RestTemplate();
	     
	    EmployeeListVO result = restTemplate.getForObject(uri, EmployeeListVO.class);
	     
	    System.out.println(result);
	}
	
	private static void getEmployeeById()
	{
	    final String uri = "http://localhost:8080/springrestexample/employees/{id}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("id", "1");
	     
	    RestTemplate restTemplate = new RestTemplate();
	    EmployeeVO result = restTemplate.getForObject(uri, EmployeeVO.class, params);
	     
	    System.out.println(result);
	}
	
	
	public static void main(String[] args){
		
		
		// http://howtodoinjava.com/spring/spring-restful/spring-restful-client-resttemplate-example/
		getEmployees2();
		System.out.println("==============================");
		getEmployees();
		System.out.println("==============================");
		getEmployeeById();
	}

}
