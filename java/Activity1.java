package JavaActivity1;

public class Activity1 {

	public static void main(String[] args) 
	{
		
	car carname = new car();
	carname.make=2014;
	carname.color= "Black";
	carname.transmission= "Manual";
	
	
	carname.displayCharacterstics();
	carname.accelerate();
	carname.brake();
	}	

}
