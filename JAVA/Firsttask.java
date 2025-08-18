import java.util.Scanner;
public class Firsttask{
	public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			int  [] getValues = new int [2];
			int sum = 0;
			int diffrence = 0;
		for(int count = 0; count < getValues.length;count++){
			System.out.println("Enter the Numbers");
				int result = input.nextInt();
			getValues[count] = getSquares(result);
				System.out.println("The Sqaure is " + getValues[count]);
				sum += getValues[count];
				}

			System.out.println("The Sum is " + sum);
			diffrence = getValues[0] - getValues[1];
			System.out.println("The diffrence is " + diffrence );

		}
	
	public static int getSquares(int value){
		
		return value * value;


		}
	
	





	}