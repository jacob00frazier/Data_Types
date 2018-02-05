// Jacob Frazier   2-5-18   Data Types-Exercise 2

public class Double_Jeopardy {

	public static void main(String[] args) 
	{
		double value = 32E+400;
	    System.out.println("A double: " +  value);

	}

}

/*	
	when I changed the value to 32.0 nothing changed because it is classified as a double.
	when i made the number greater than the range of a double I got this error "The literal
	32E+400 of type double is out of range " because there is not enough bits to represent that number as a double.
		 
 */
