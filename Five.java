package training;
import java.util.*;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PRIME NUMBERS
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=scanner.nextInt();
		
		if(number<=0) {
			System.out.println("Invalid");
		}
		else if(number%2==0) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

}
