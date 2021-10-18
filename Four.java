package training;
import java.util.*;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);      
		System.out.println("array length");
		int n=s.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("enter array values");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.print("Before sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		
		System.out.println("");
		
		int temp=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		
		System.out.print("After sort : ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}

	}

}
