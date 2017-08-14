package com.mk.onlineshopping.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFound(){
		ModelAndView mv=new ModelAndView("error");
		
		mv.addObject("errorTitle", "This page is not contructed!");
		mv.addObject("errorDescription", "This page you are looking for is not available now!");
		mv.addObject("title", "404 Error Page");
		
		return mv;
	}
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFound(){
		ModelAndView mv=new ModelAndView("error");
		
		mv.addObject("errorTitle", "Product not avaolable!");
		mv.addObject("errorDescription", "The Product you are looking for is not available right now!");
		mv.addObject("title", "Product unavailable");
		
		return mv;
	}
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex){
		ModelAndView mv=new ModelAndView("error");
		
		/* only for debugging your aplication */
		StringWriter sw=new StringWriter();
		PrintWriter pw=new PrintWriter(sw);
		
		ex.printStackTrace(pw);
		
		mv.addObject("errorTitle", "Contact Your Administrator!");
		mv.addObject("errorDescription", sw.toString());
		mv.addObject("title", "Error!");
		
		return mv;
	}
}
