import java.util.Scanner;

public class ResearchData{

	public static void main(String []args){

	Scanner input= new Scanner(System.in);
	System.out.print("Enter Min Temprature of Locality : ");
	double min = input.nextDouble();

	System.out.print("Enter Max Temprature of Locality : ");
	double max = input.nextDouble();

	System.out.print("Enter Average Temprature of Locality : ");
	double avg = input.nextDouble();

	System.out.print("Enter the population of the Town : ");
	int popoftown = input.nextInt();

	System.out.print("Enter The Population Of The State : ");
	int popofstate = input.nextInt();

	System.out.print("For Metropolis city write true else false : ");
	boolean metroplscheck = input.nextBoolean();

	System.out.print("Enter Average Litracy Percentage of City : ");
	double avglitrc = input.nextDouble();

	System.out.print("Please Enter Average Qualification of the Population : ");
	String avgQualf =input.next();
		
	}
}