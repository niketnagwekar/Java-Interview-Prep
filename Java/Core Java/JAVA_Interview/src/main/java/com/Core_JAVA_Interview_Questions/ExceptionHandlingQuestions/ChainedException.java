package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class ChainedException {

	public static void main(String[] args) {

		 try
	        {
	            //creating an exception
	 
	            NumberFormatException ex = new NumberFormatException("This is out/wrapped Exception");   
	 
	            //setting a cause of the exception
	 
	            ex.initCause(new NullPointerException("This is actual cause of the exception"));  
	 
	            throw ex;
	        }
	        catch(NumberFormatException ex)
	        {
	            System.out.println(ex);     //displaying the exception
	 
	            System.out.println(ex.getCause());    //getting the actual cause of the exception
	        }
		 
	}

}
