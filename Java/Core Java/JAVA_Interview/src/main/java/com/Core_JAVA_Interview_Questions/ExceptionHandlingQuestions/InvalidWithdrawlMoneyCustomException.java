package com.Core_JAVA_Interview_Questions.ExceptionHandlingQuestions;

public class InvalidWithdrawlMoneyCustomException {

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
                throw new InvalidWithdrawlMoneyException();
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(InvalidWithdrawlMoneyException ex)
        {
            //InvalidWithdrawlMoneyException will be caught here
 
            System.out.println(ex);
        }
        
	}

}

class InvalidWithdrawlMoneyException extends ArithmeticException
{
    //Overriding toString() method of ArithmeticException as per our needs
 
    @Override
    public String toString()
    {
        return "You don't have that much of money in your account";
    }
}