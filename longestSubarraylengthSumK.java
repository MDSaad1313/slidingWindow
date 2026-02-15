package JavaRevision;
import java.util.*;

public class longestSubarrayLengthSumK {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,1,0,1,1,0};
		
		int k = 4;
		
		int left = 0;
		
		int currentSum = 0;
		
		int maxLength = 0;
		
		for(int right = 0; right <arr.length; right++) {
			
			currentSum += arr[right];
			
			if(currentSum > k) {
				
				currentSum -= arr[left];
				
				left++;
			}
			
			 maxLength = Math.max(maxLength, right - left + 1);
			
		}
		System.out.println(maxLength);
	}
}
