package com.caveofprogramming.spring.web.controllers;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.dao.DataAccessException;

@ControllerAdvice
public class DatabaseErrorHandler {
	
	@ExceptionHandler(DataAccessException.class)
	public String handleDatabaseException(DataAccessException ex) {
		return "error";
	}

   /* @ExceptionHandler(DataAccessException.class)
    public ModelAndView handleDataAccessException(DataAccessException ex) {
        ModelAndView mav = new ModelAndView("errorPage"); // Name of your JSP error page
        mav.addObject("errorMessage", "An error occurred while accessing data.");
        mav.addObject("exception", ex); // Optional: Pass the exception object for more details
        return mav;
    }*/
}
/*import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DatabaseErrorHandler {
	@ExceptionHandler(DataAccessException.class)
	public String handleDatabaseException(DataAccessException ex) {
		return "error";
	}
}



*/
