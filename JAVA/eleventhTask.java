import java.util.Arrays;
public class  eleventhTask{
	public static void main (String [] args){
		int [] value = {2,3,45,6,10,3,334,1101,33,3222,1};
		System.out.println(Arrays.toString(sortArray(value)));
	
		}
	public static int [] sortArray(int [] array){
				int store = 0;
			for (int count = 0; count < array.length;count++){
				for (int counter = 0; counter < array.length; counter++){
						if (array[count] < array[counter]){
							store = array[count];
							array[count] = array[counter];
							array[counter] = store;
							
								}
							}

						}
				return array;

			}


	}