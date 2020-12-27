package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class FinallyExecution {

	public static void main(String[] args)
    {
        System.out.println(methodReturningValueFinally());    //Output : 10
        
        System.out.println(methodReturningValue());
    }
 
    static int methodReturningValueFinally()
    {
        try
        {
            return 10;    //control will not be passed to main() method here
        }
        catch (Exception e)
        {
            return 20;    //Control will not be passed to main() method here
        }
        finally
        {
            System.out.println("finally block is always executed");
 
            //Control will be passed to main() method after executing this block
        }
    }
    
    static int methodReturningValue()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
            i = 2;
        }
        finally
        {
            i = 3;
        }
 
        return i;
    }
    
}
