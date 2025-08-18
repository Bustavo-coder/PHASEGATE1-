public class  Thirteenthtask{
	public static void main (String [] args){
		int [] value = {2,3,45,6,10,3,334,1101,33,3222,1};
		System.out.println(getsecondlargest(value));
	
		}
	public static int getsecondlargest(int [] array){
			int largeset = array[0];
			int secondlargest = array[0];
			for (int count = 0; count < array.length;count++){
				if (array[count] > largeset) largeset = array[count];
				}
			for (int counter = 0;counter < array.length;counter++){
				if (array[counter] == largeset) continue;
				if (array[counter] > largeset) {secondlargest  = largeset;}
				}
			return secondlargest;
			}


	}