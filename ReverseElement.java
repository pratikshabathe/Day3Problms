package blz.com.day3;

import java.util.Scanner;

public class ReverseElement {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element in array ");
		
		for(int i =0; i<a.length; i++)	{	
			a[i] = sc.nextInt();
		}
		System.out.println("Array Element");
		for(int i =0; i<a.length; i++)	{	
			System.out.println(a[i] + " ");
		}
		System.out.println("Array reverse element");
		for(int i = a.length-1; i>=0 ; i--)	{	
			System.out.println(a[i] + " ");
		}
	}

}
