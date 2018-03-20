import java.util.Scanner;
public class BookProblum9{

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		
		MyMethods CTF= new MyMethods();
		System.out.println("Enter The Starting Velocity in Meters/Second : ");
		System.out.println("Enter The Ending Velocity in Meters/Second : ");
		System.out.println("Enter The Time Span in Second : "+
		"\nrespectively");
		
		double acceleration =CTF.acceleration(inp.nextDouble(),inp.nextDouble(),inp.nextDouble());
		System.out.println("The Acceleration is "+ acceleration+" m/s^2");
		}
		
	}


class MyMethods{

	public double acceleration(double V1,double V0,double T){
		
		return (V1 - V0)/T;
	}
}