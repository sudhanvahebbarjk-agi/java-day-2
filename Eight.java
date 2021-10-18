package training;
import java.util.*;

public class Eight {
	
	int binarySearch(int a[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (a[mid] == x)
                return mid;
           
            if (a[mid] > x)
                return binarySearch(a, l, mid - 1, x);
 
            return binarySearch(a, mid + 1, r, x);
        }
 
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// binary sort
		
		Scanner s=new Scanner(System.in);
		Eight pgm=new Eight();
		
		System.out.println("Enter the number of element in the array : ");
		int arrayLength=s.nextInt();
		
		int[] a=new int[arrayLength];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arrayLength;i++) {
			int num=s.nextInt();
			a[i]=num;
		}
		
		System.out.println("Enter number to find : ");
		int x=s.nextInt();
		
		int result = pgm.binarySearch(a, 0, arrayLength-1 , x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
		
		
	}

}
