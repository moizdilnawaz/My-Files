import java.util.Scanner;
public class ShippingCost{

	public static void main(String args[]){

	Scanner input= new Scanner(System.in);
	System.out.print("Please Enter The Weight : ");
	double w = input.nextDouble();
	double shpCost= shipingCstCalc(w);
	System.out.println("The Shipping Cost Is : " + shpCost);
	
	}
	public static double shipingCstCalc(double weight)
	{	if(weight > 0 && weight <=1){
			return 30.5;
		}
		else if(weight > 1 && weight <=3){
			return 50.5;
		}
		else if(weight > 3 && weight <=10){	
			return 80.5;
		}
		else if(weight > 10 && weight <=20){
			return 100.5;
		}
		else if(weight>20){
			System.out.println("The Package Cannot be shipped");
			return 0;	
		}
		else{
			System.out.println("Invalid Input");
			return 0;
		}
	}	

}


