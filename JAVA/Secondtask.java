import java.util.Scanner;
	public class Secondtask{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter The First Numbers");
			int userInput = input.nextInt();
			int sum = 0;
			int largest = userInput;
			int smallest =  userInput;
			int product = 1;

			for(int count = 0; count < 2; count++){
				if(userInput > largest)  largest = userInput;
				if(userInput <  smallest)  smallest = userInput;
				System.out.println("Enter The Numbers");
				userInput = input.nextInt();
				sum += userInput;
				product *= userInput;
				}

			System.out.println(sum);
			System.out.println(product);
			System.out.println(smallest);
			System.out.println(largest);
			int average = sum / 3;
			System.out.println(average);

			}


	}