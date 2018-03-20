import java.util.Scanner;

public class EmployBonus
{
	public static void main(String []args)
	{
		Scanner input= new Scanner(System.in);
		//int value1 = packagesDiliverd();
		//int value2 = allownce();
		//int value = value1 + value2;
		//value = (value * 0.1)*value;
		//System.out.println(value);
		System.out.println("Enter The Grade A1or A2 or A3");
		String grade = input.nextLine();
		if(grade.equals("A1")){
		value =(value*0.05)*value;
		}
		else if(grade.equals("A2")){
		value =(value*0.1)*value;
		}
		if(grade.equals("A1")){
		value =(value*0.15)*value;
		}
		system.out.println("The Estimated Value is : " + value);
	}
	public static int packagesDiliverd()
	{
	Scanner input= new Scanner(System.in);
	System.out.println("Please Enter 1 For Permenent or 2 for Temprory Employs : ");
		int x = 1;
		int unitCostOfPackage;
		int noOfPackgesDilivered;
		int paymentForPackages;
		if(x==1)
		{
		unitCostOfPackage= 5000;
		noOfPackgesDilivered= input.nextInt();
		paymentForPackages = unitCostOfPackage * noOfPackgesDilivered;
		return paymentForPackages;	
		}
		else if(x==2)
		{
		unitCostOfPackage= 3000;
		noOfPackgesDilivered= input.nextInt();
		paymentForPackages = unitCostOfPackage * noOfPackgesDilivered;
		return paymentForPackages;	
		}
		return paymentForPackages;	
	}
	public static int allownce()	
	{	
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter 1 For Permenent or 2 for Temprory ");
		int x= input.nextInt();
		
		if ( x == 1)
		{
		int dailyAllownce= 500;
		return dailyAllownce;
		}
		else if(x == 2)
		{
		int dailyAllownce= 300;
		return dailyAllownce;
		}	
		return dailyAllownce;
	}
}