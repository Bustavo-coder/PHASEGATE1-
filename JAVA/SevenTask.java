public class  SevenTask{
	public static void main (String [] args){
		int [] value = {2,3,45,6,10,3,334,1101,33,3222,1};
		int smallest = value[0];
		for(int count = 0; count < value.length;count++) if (value[count] < smallest) smallest = value[count];
		System.out.println(smallest);
	

		}


	}