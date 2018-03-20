public class BookProblum1{

	public static void main(String[] args){
		
		
		CentigradeToFarenheight CTF= new CentigradeToFarenheight();
		double value=CTF.centigradeToFarenheight(53.9);
		System.out.println("The Farenheight Value is "+ value);
		
	}

}
class CentigradeToFarenheight{
	
	private double farenheight; 
	private double centigrade;
	
	public double centigradeToFarenheight(double Centigrade){
		
		this.farenheight= (9.0/5)*Centigrade +32;
		return this.farenheight;
	}
	
	
	
	
	
	
	
	
	
	
}