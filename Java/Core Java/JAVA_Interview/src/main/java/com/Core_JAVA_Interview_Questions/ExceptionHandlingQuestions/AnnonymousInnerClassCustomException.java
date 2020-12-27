package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class AnnonymousInnerClassCustomException {

	public static void main(String[] args) {
		int balance = 5000;            //Initializing the balance
		 
        int withdrawlMoney = 6000;
 
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
 
            if(withdrawlMoney > balance)
            {
                throw new ArithmeticException() {
                	
                	@Override
                	public String toString() {
                		return "Insufficient Funds!!!";
                	}
                };
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(ArithmeticException ex)
        {
            //InvalidWithdrawlMoneyException will be caught here
 
            System.out.println(ex);
        }
	}

}
