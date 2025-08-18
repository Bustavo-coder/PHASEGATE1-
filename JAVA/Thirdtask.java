import java.util.Scanner;
public class Thirdtask{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The First Numbers");
		int userInput = input.nextInt();
			if (userInput % 3 == 0) System.out.print("It Is Divisible by 3");
			else System.out.print("It Is Not Divisible by 3");

		}


	}