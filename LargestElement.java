package blz.com.day3;

public class LargestElement {
	public static void main(String[] args) {
		int a[] = {10, 20, 5, 30, 70};
		int max;
		
		max = a[0];
		for(int i =0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Largest element:" + max);

	}
}
