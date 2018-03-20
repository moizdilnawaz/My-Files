import java.util.Scanner;

public class TutionFee{

	public static void main(String []args){
	Scanner input= new Scanner(System.in);
	System.out.print("Enter The Value of Percentage u want to increase : ");
	int percent = input.nextInt();
	System.out.println("The Tution Fee will be increased in : " + check(500) + " Years");
	}
	public static int check(double tutionfee){
	int n =0;
	double temp =tutionfee*2;
	while(!(tutionfee>= (temp))){
		tutionfee = ((tutionfee*7)/100)+tutionfee;	
		n++;
	}	
	return n;
	}
}