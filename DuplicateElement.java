package blz.com.day3;

public class DuplicateElement {
	
	public static void main(String[] args) {
		
	String arr[] = {"java", "c", "c++", "python", "java"};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1;  j<arr.length; j++ ) {
			if (arr[i] == arr[j]) {
				System.out.println("Found duplicate Element:" +arr[i]);
			  }
		   }
		}
	}
}
