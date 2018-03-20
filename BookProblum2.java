import java.util.Scanner;
public class BookProblum2{

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		
		MyMethods CTF= new MyMethods();
		System.out.print("Enter The A For Area else V For Volume");
		String choice = inp.nextLine();
		
		if(choice.equals("A")){
		System.out.print("Enter The radius");
		double area=CTF.area(inp.nextDouble());
		System.out.println("The Area is "+ area);
		}
		else if(choice.equals("V")){
		System.out.print("Enter The radius and Lenth Respectively : ");
		double volume=CTF.volume(inp.nextDouble(),inp.nextDouble());
		System.out.println("The Volume is "+ volume);
		}
		
		
	}

}
class MyMethods{
	
	public double area(double radius ){
		
		return radius * radius *Math.PI;

	}
	public double volume(double radius ,double lenthOfCylinder){
		
		return area(radius) * lenthOfCylinder;
	}
	
}