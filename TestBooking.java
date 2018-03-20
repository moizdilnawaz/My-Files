import java.util.Scanner;
public class TestBooking{

	public static void main(String []args){

	Scanner input= new Scanner(System.in);
    	Booking b1= new Booking();
    	System.out.println("Please Enter Booking ID : ");
    	b1.setBookingId(input.nextLine());
    	System.out.println("Please Enter Departure Date : ");
    	b1.setDate(input.nextLine());
    	System.out.println("Please Enter Qantity of Tickets: ");
        b1.setNoOfTickets(input.nextInt());    
    	System.out.println("Please Enter Cabin Type : ");
	b1.setCabinType(input.nextLine());
    	System.out.println("Please Enter Your Destination : ");
	b1.setDestination(input.nextLine());


	if((b1.getDestination()).equals("Singapore")){
		b1.setTotalPrice(10000,b1.getNoOfTickets());
	}
	else if((b1.getDestination()).equals("Tokiyo")){
		b1.setTotalPrice(15000,b1.getNoOfTickets());
	}
	else if((b1.getDestination()).equals("Japan")){
		b1.setTotalPrice(20000,b1.getNoOfTickets());
	}
	System.out.println("\n");
	b1.ticketConfirmation();

	
	
/*	1. input The Feilds Respected	
	2. call The Funtion Total Price and Print it
	3. Ticket Confirmation
	4. End The Program
*/

    }

}
class Booking{

    private String bookingId;
    private String date;
    private int noOfTickets;
    private double price;
    private String cabinType;
    private double totalPrice;
    private String destination;

    public Booking(String bookingId,String date,int noOfTickets, double price, String cabinType,String destination){

    this.bookingId=bookingId;
    this.date=date;
    this.noOfTickets=noOfTickets;
    this.price=price;
    this.cabinType=cabinType;
    this.destination = destination;
	}
public Booking(){
//for instant use to initilize a Raw entry
    bookingId= "0000";
    date= "20-09-2009";
    noOfTickets= 0;
    price= 0;
    cabinType= "Economy Class";
    destination = "none";

}

public void setBookingId(String bookingId){
    this.bookingId=bookingId;
}
public void setDate(String date){
    this.date=date;
}
public void setNoOfTickets(int noOfTickets){
    this.noOfTickets=noOfTickets;
}
public void setPrice(double price){
    this.price=price;
}
public void setCabinType(String cabinType){
    this.cabinType=cabinType;
}
public void setDestination(String destination){
    this.destination=destination;
}


public String getBookingId(){
    return bookingId;
}
public String getDate(){
    return date;
}
public int getNoOfTickets(){
    return noOfTickets;
}
public Double getPrice(){
    return price;
}
public String getCabinType(){
    return cabinType;
}
public String getDestination(){
    return destination;
}
public void setTotalPrice(double price,int noOfTickets){
	this.price= price;
	totalPrice=price*noOfTickets;
}
public void ticketConfirmation(){
	System.out.println("Booking ID "+bookingId);
	System.out.println("Date "+date);
	System.out.println("No OF Tickets "+noOfTickets);
	System.out.println("Cabin Type "+cabinType);
	System.out.println("Desegnation "+destination);
	System.out.println("Total Price "+totalPrice);
}
  
}
