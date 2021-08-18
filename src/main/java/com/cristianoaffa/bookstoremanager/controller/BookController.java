package com.cristianoaffa.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	
	/*	
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success method return")
	})
	*/	
	@ApiOperation(value = "Return an example hello world")
	@GetMapping
	public String hello() {		
		return "hello bookstore manager!";	
		
	}

}
