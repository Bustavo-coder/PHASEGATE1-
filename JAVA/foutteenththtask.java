public class foutteenththtask{
	public static void main (String [] args){
		int value = 5 ;
		System.out.println(getfactorila(value));
		}

	public static int getfactorila (int num){
			int factorial = 1;
			for (int count = num ; count > 1;count--)factorial *= count;
			return factorial;
		}

	}