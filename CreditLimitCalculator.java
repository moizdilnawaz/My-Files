import java.util.Scanner;

public class CreditLimitCalculator{

	public static void main(String []args){
	int aldcreditlimit = 50000;
	Scanner input= new Scanner(System.in);
	System.out.print("Please Enter The Acount No : ");
	int acntno = input.nextInt();
	System.out.print("Please enter The Balance in the begning of Month : ");
	int balBegMonth= input.nextInt();
	System.out.print("Please Enter The Total Amount Charged This Month");
	int ttlAmntChrgdThMonth = input.nextInt();
	System.out.print("Please Enter THe Allowed Credit limit : ");
	int alldcreditLimit = input.nextInt();
	double balance = balBegMonth + ttlAmntChrgdThMonth - alldcreditLimit;
	
	if (balance > alldcreditLimit)
		System.out.println("Credit Limit Exceded");
		System.out.println(balance);
	}

	
}