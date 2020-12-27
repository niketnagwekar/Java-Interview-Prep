package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class ReturnValueFromTryCatchFinally {

	/*
	 * If method returns a value and also has try, catch and finally blocks in it, then following two rules need to follow.
        1) If finally block returns a value then try and catch blocks may or may not return a value.

        2) If finally block does not return a value then both try and catch blocks must return a value.
	 */
	public static void main(String[] args) {
		System.out.println(methodReturningValue());
		System.out.println(methodReturningValueFromTryCatch());
	}
	static int methodReturningValue()
    {
        try
        {
            //This block may or may not return a value as finally block is returning a value
        }
        catch (Exception e)
        {
            //This block may or may not return a value as finally block is returning a value
        }
        finally
        {
            return 20;
        }
    }
	
	static int methodReturningValueFromTryCatch()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            //Now, This block may or may not return a value
            //as both try and catch blocks are returning a value
        }
    }
	
//	If try-catch-finally blocks are returning a value according to above rules, then you should not keep any statements after finally block.
//	Because they become unreachable and in Java, Unreachable code gives compile time error.
	static int methodReturningValueFromTryCatchUnreachableCode()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            //Now, This block may or may not return a value
            //as both try and catch blocks are returning a value
        }  
//        System.out.println("Unreachable code");   //Compile Time Error : Unreachable Code
    }
	
//	finally block overrides any return values from try and catch blocks.
	
	static int methodReturningValueFianllyBlockOverridingValues()
    {
        try
        {
            return 10;
        }
        catch (Exception e)
        {
            return 20;
        }
        finally
        {
            return 50;    //This method returns 50 not 10 or 20
        }
    }

}
