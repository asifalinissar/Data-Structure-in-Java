
//Align of the target number in the array to right side ;
//with low time and space complexity;

import java.util.Arrays;

public class arrayAllign {
	
	
	public static int[] alignToright(int [] array, int target) {
		
		int i = 0; 
		int j = array.length - 1;
		while(i<j) {
			if(array[i] != target) { 
				i++;
				continue;
			}if(array[j] == target) {
				j--;
				continue;
			}
			// Swap ( this swap will only work when the two condition will fail)
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
			i++;
		}
		return array;
	}
	public static void main(String [] args) {
		 int[] array = {3, 2, 4, 5, 2, 3, 4, 4, 5};
	        int target = 4;
	        
	        int [] result = alignToright(array ,target);
	        System.out.println(Arrays.toString(result));
	}

	
}
