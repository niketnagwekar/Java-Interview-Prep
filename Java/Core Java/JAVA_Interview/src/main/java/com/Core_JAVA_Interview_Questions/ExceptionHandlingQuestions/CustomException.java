package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class CustomException {

	public static void main(String[] args) {

		int age = -4 ;      //Taking input from user
		 
        try
        {
            if(age < 0)
            {
                throw new AgeIsNegativeException("Age can not be negative");    //throws AgeIsNegativeException if age is negative
            }
        }
        catch(AgeIsNegativeException ex)
        {
            System.out.println(ex);    //Output : Age can not be negative
        }
	}

}
class AgeIsNegativeException extends Exception
{
    String errorMessage;
 
    public AgeIsNegativeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
 
    //Modifying toString() method to display customized error message
 
    @Override
    public String toString()
    {
        return errorMessage;
    }
}
