

//array = {1,3,5,6,2,7,4};
//target = 10;
//set is a hash set; so we can check easily;

import java.util.HashSet;
import java.util.Set;

public class sample1 {
	
	public static int[] twoNumbersum(int []array, int target) {
		
	Set<Integer> nums = new HashSet<>();
	for (int i =0; i<array.length;i++) {
		int num = array[i];
		int match = target - num;
		if(nums.contains(match)) {
			return new int[] {num,match};
		}else {
			nums.add(num);
		}
		
	}
		
		
		
		
		
		return new int [0];
	}
	
	public static void main(String [] args) {
		
		
		int [] array = {1,3,5,6,2,7,4};
		int target = 10;
		
		int[] result = twoNumbersum(array,target);
		
		for(int res : result) {
			System.out.println(res);
		}
	}

}
