import java.util.Arrays;
public class  Tenth{
	public static void main (String [] args){
		int [] value = {2,3,45,6,10,3,334,1101,33,3222,1};
		System.out.println(Arrays.toString(getLargestSmalest(value)));
	
		}
	public static int [] getLargestSmalest(int [] array){
			int largeset = array[0];
			int smallest = array[0];
			for (int count = 0; count < array.length;count++){
				if (array[count] > largeset) largeset = array[count];
				if (array[count] < smallest) smallest = array[count];
		
				}
			int [] minmax = {largeset,smallest};
			return minmax;
			

			}


	}