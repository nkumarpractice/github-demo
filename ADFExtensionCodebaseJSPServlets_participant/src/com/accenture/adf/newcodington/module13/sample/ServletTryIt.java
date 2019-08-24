package com.accenture.adf.newcodington.module13.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Topic : Servlets
 * Instructions : 
 * 1. Activity to create a Servlet and execute the same
 * 2. Override doGet method to print numbers from 1 to 10
 * 3. Code as per the TODOs 
 */

public class ServletTryIt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTryIt() {
        super();

    }

    // Overriding doGet method to print numbers from 1 to 10    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TODO 1 Obtain PrintWriter object from HttpServletResponse object using the getWriter() method
		
		
		//TODO 2 Using the PrintWriter object print a list of numbers from 1 to 10
		//       You may optionally print the numbers in a table

		
		//TODO 3 Print hyperlink reference to index.html labeled 'Home' and enclose it in <h1>
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TODO 4 Call doGet() method with the appropriate parameters
		
	}

}
