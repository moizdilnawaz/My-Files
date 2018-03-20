import java.util.Scanner;
public class BookProblum3{

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		
		MyMethods CTF= new MyMethods();
		System.out.println("Enter Number in Foot : ");
		double foot =CTF.footToMetere(inp.nextDouble());
		System.out.println("The Volume is "+ foot);
		}
		
	}


class MyMethods{

	public double footToMetere(double foot){
		
		return (1/0.305)* foot;
	}
}