import java.util.Scanner;
public class Encryption{

	public static void main(String []args){
		Scanner input= new Scanner(System.in);
		System.out.print("Please Enter 1 To Encode Or 2 To Decode : ");
		int x= input.nextInt();
		if (x==2){
		decoder();
		}
		else if(x==1){
		encodder();	
		}
		else{
			
			System.out.println("Invalid input!! Please Try Again");
		}
		
	}
	public static void decoder(){
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter The 4 Digit no To Decode");
		int fdigit= input.nextInt();
		int x1 = (((((fdigit%10)%10)+7)%10)+6)%10;
		int x2 = ((((((fdigit/10)%10)%10)+7)%10)+6)%10;
		int x3 = (((((((fdigit/100)%100)%10)%10)+7)%10)+6)%10;
		int x4 = (((((fdigit/1000)%10)+7)%10)+6)%10;
		int x = (x3 * 1000) + (x4*100) + (10 * x1)+ (x2*1);
		System.out.print("The Decripted Value is : " + x);
	}

// sout= 2153
	public static int encodder(){
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter The 4 Digit no To Encode");
		int fdigit= input.nextInt();
		//int fdigit= 4568;
		int x1= ((fdigit%10)+7)%10;
		int x2= (((fdigit/10)%10)+7)%10;
		int x3= ((((fdigit/100)%100)%10)+7)%10;
		int x4= ((fdigit/1000)+7)%10;
		int x = (x3 * 1000) + (x4*100) + (10 * x1)+ (x2*1);
		System.out.print("The Encripted Value is : " + x);
		return x;
	}
}