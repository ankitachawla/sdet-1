package JavaActivity1;
public class Ativity2_1 {
	
		public static void main(String []args) 
{   
   String title = "Hover Car Racer";
   book newnovel=new mybook();

	newnovel.settitle(title);
	System.out.println("The title is: " + newnovel.gettitle());
}

}
        abstract class book{
		String title;
		abstract void settitle(String s);
		
		String gettitle()
		{
			return title;
		}
	}
     class mybook extends book
    {
    	public void settitle(String s) {
    	    title = s;
    	
    	}
    	
    }    	