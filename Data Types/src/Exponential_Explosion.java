// Jacob Frazier   2-5-18   Data Types-Exercise 3

public class Exponential_Explosion {

	public static void main(String[] args) 
	{
		 double value = 32E+1000
;
		 System.out.println("e to the power value: " +  Math.exp( value ) );
		

	}

}
/*
	The program did compile and run correctly because the value was lower then 
	the highest amount a double can be. When I changed the value to a greater 
	number it gave me this error "The literal 32E+1000 of type double is out of range"
	because  the value was greater then the highest amount a double can be.
	
*/
