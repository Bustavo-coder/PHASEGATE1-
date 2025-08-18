import java.util.Arrays;
public class  NinethTask{
	public static void main (String [] args){
		int [] value = {2,3,45,6,10,3,334,1101,33,3222,1};
		System.out.println(Arrays.toString(printReverse(value)));
	
		}
	public static int [] printReverse(int [] array){
			int [] newArray = new int [array.length];
			int counter = array.length-1;
			for (int count = 0; count < newArray.length;count++){
				newArray[count] = array[counter];
				counter--;}
			return newArray;

			}


	}