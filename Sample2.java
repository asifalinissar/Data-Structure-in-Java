//problem

// problem is we have a  array , example Array {3,2,4,5,2,3,4,4,5,}
// in this array we have a target number , what is want is we want to arrange this number in the
// form like the all the selected number should come in the left side.


//logic

//first we have two point first (i) is the starting of the array and (j) ending of the array
//first check the first element is target then check the last element is target , if the last element is target 
//decrement the j and again check the condition and if not matches set the target there;

import java.util.Arrays;

public class Sample2 {

	public static void main (String [] args) {
		int[] array = {3,2,4,5,2,3,4,4,5,};
		int target = 2;
		
		int [] allignResult = allignRight(array,target);
		System.out.println(Arrays.toString(allignResult));
		
	}
	
	public static int[] allignRight(int [] array,int target) {
		
		int matches = target;
		int i = 0;
		int j = array.length - 1;
		
		for( i = 0; i<array.length;i++) {
			if(array[i]==matches) {
				for( j = array.length - 1 ; j>i;j--) {
					if(array[j] != matches) {
						
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
						break;
					}
				
				}
			}
		}
		
		return  array;
	}
}
