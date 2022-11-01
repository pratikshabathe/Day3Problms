package blz.com.day3;

public class FrequencyOfArray {
public static void main(String[] args) {
		
		int arr[] = { 10, 20, 70,};
		
		for ( int i = 0; i<arr.length; ++i) {
			int x = arr[i];
			int count = 0;
			
			for(int j = 0; j < arr.length; ++j) {
				if(arr[j] == x) {
					++count;
					arr[j] = -1;
				}
			}
			System.out.println("frequency of " +x +" is " +count);
		}
	}
}
