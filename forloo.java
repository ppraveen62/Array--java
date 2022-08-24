package demo;
//WAP to accept a multidimensional array  by taking row and column sizes from the keyboard and display it
import java.util.*;
public class forloo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give input for row size: ");
		int i = sc.nextInt();
		System.out.println("give input for column size: ");
		int j = sc.nextInt();
		
		String [][] arr=new String[i][j];//00 01 10 11
		
		for(int m=0;m<i;m++) {
			
			for (int n=0;n<j;n++) {
				System.out.println("give matrix value a["+m+"]["+n+"]:");
				arr[m][n]=sc.next();
				
			}
		}             //system.out.printl);
		
		System.out.println(arr);
			
		for(int m=0;m<i;m++) {
				
				for (int n=0;n<j;n++) {
					System.out.print(arr[m][n]+" ");
			
		}
				System.out.println("\n");
				
			}
		
		
		

	
	}
}
