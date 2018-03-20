import java.util.Scanner;

public class TestPoint{

	public static void main(String []args){
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the Cordinates of Point 1 x and y respectively : ");
	Point p1= new Point(input.nextInt(),input.nextInt());
	System.out.println("Enter the Cordinates of Point 2 x and y respectively : ");
	Point p2= new Point(input.nextInt(),input.nextInt());
	
	if((p1.getX()==p2.getX()) && p1.getY()==p2.getY()){
	System.out.println("Points Are Same");
	System.out.println("Line Cant be Drawn");
	}
	else{
	System.out.println("Points Are Diffrent");
	System.out.println("Line is Drawn");
	}
	}
}

class Point{

private int x;
private int y;

public Point(int x,int y){
this.x=x;
this.y=y;
}
public Point(){

this.x=0;
this.y=0;
}

public void setX(int x){
this.x=x;
}
public void setY(int y){
this.y=y;
}

public void displayPoints(){

System.out.println(toString());

}

public int getX(){
return x;
}

public int getY(){
return y;
}


public void displayPoints(){
System.out.println("The x of This Obj : "+ x);
System.out.println("The y of This Obj : "+ y);
}

}
