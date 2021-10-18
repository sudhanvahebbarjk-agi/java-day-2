package training;
import java.util.*;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reverse of string
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		long number=s.nextLong();
		long reverse = 0;
		
		while(number != 0)   
		{  
			long remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}
		
		System.out.println("Reverse of number is : "+reverse);

	}

}
