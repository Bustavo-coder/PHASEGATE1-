import java.util.Scanner;
import java.util.Arrays;
public class Creditcardcalculator{
	public static Scanner input = new Scanner (System.in);
		public static void main(String [] args){
			userInterface();	
			}

		public static String getUserInput(){
				String userInput = input.nextLine();
				userInput = userInput.trim();
				return userInput;
			}

		public static boolean isValidated(String input){
			boolean checklength = input.length() > 12 && input.length() <= 16;
			boolean checkForAlpha = true;
				for (int index = 0; index < input.length();index++){
					if(Character.isLetter(input.charAt(index))) checkForAlpha = false;
					}
				return checkForAlpha && checklength;
				}

		public static char [] getArrayInput(String input){
			char [] arrayOfInput = input.toCharArray();
				return arrayOfInput;
					}

		public static String getTypeOfCard(String input){
				String cardType = "";
				String joined = input.charAt(0) + "" + input.charAt(1);
				if(input.charAt(0) == '4') cardType = "Visa Card";
				else if(input.charAt(0) == '5')cardType = "Master Card";
				else if(input.charAt(0) == '6')cardType = "Discover Card";
				else if(joined.equals("37")) cardType = "American Express Card";
				else cardType = "Invalid Card";
				return cardType;
				}
		public static int convertChartoInt(char input){
				int converted = (int) (input - '0');
				return converted;
				}

		public static int getSumOfCardNo(char [] arrayOfNumbers){
			int sumOfOddPosition = 0;
			int sumOfEvenPosition = 0;
			for(int index = arrayOfNumbers.length - 1;index >= 0; index--){
				int convertArrayCharToInt = convertChartoInt(arrayOfNumbers[index]);
				int squaresConvetedChar = 2 * convertArrayCharToInt;

					if( squaresConvetedChar > 9){
					String convertToString = squaresConvetedChar + "";
					squaresConvetedChar = convertChartoInt(convertToString.charAt(0)) + convertChartoInt(convertToString.charAt(1));
								}

					if(index % 2 == 0)sumOfEvenPosition += squaresConvetedChar;	
					else sumOfOddPosition += convertArrayCharToInt;
					}
			int getResult = sumOfOddPosition + sumOfEvenPosition;
					return getResult;
			}
			public static String checkCardValidity(int result){
					String response = "Invalid";
					if(result % 10 == 0) response = "Valid";
					return response;
				}

			public static void userInterface(){
				System.out.println("Hello Kindly Enter Your Card Details");
				 String userInput = getUserInput();
				System.out.println("********************************");
				System.out.printf("%s%s%n","Credit Card Number: ", userInput );
					if(isValidated(userInput)){
							System.out.printf("%s%s%n", "Credit Card Type ", getTypeOfCard(userInput));
							System.out.printf("%s%d%n", "Credit Length : ", userInput.length());
							char [] getinputToArray = getArrayInput(userInput);
							int calCardNo = getSumOfCardNo(getinputToArray);
							System.out.printf("%s%s%n", "Credit Card Validity Status : ",checkCardValidity(calCardNo) );

							}
					else {
							System.out.println("****************************************************");
							System.out.printf("%s%s%n", "Credit Card Type ", "Invalid ");
							System.out.printf("%s%d%s%n", "Credit Card Length ",userInput.length()," Length Must be between 13 and 16 and contain Only Numbers");
							System.out.printf("%s%n", "Credit Card Validity Status : Invalid ");
							}
				
				}

		

	}