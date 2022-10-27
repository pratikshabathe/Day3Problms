package blz.com.day3;

import java.util.Scanner;

public class PrintElement {
	
	//Print element in array
	public static void main(String[] args) {
		int a[] = {10, 20, 5, 30};
		int min;
		int max;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Element");
		for(int i =0; i<4; i++) {
			System.out.println(a[i] + " " );
		}
		
		// Smallest Element in array
		min = a[0];
		for(int i =0; i<a.length; i++) {
			if(a[i]< min) {
				min = a[i];
			}
		}
		System.out.println("Smallest element:" + min);
		
		// Largest Element in Array
		
		max = a[0];
		for(int i =0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Largest element:" + max);
	}
}
