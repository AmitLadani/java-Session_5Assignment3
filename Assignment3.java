
public class Assignment3 {

	double Area;		
	
	  Assignment3(double length){  
		   double Ar =length*length;  
		   Area=Ar;
		  		  		    }  
	
	 Assignment3(double length, double width){  
		   double Ar =length*width; 
		   Area=Ar;	   	
		    }  
	  	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment3 Squre = new Assignment3(14.5);  
		Assignment3 Rectangle = new Assignment3(22.2, 25.89);
		System.out.println("Area of Squre is : "+ Squre.Area + " Sq Unit");
		System.out.println("Area of Rectangle is : "+ Rectangle.Area + " Sq Unit");
		
	
	}

}
