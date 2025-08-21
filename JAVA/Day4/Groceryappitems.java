import java.util.Scanner;
import java.util.ArrayList;
public class Groceryappitems{
	public static ArrayList<String> itemsList = new ArrayList<String>();

	public static void main (String [] args){
			userInterface();
		}
	
	public static String addItemToList(String input){
				itemsList.add(input);
				return input;
			}

	public static int removeItemFromList(String input){
				int result  = 0;
				if(itemsList.contains(input)){
					itemsList.remove(input);
					result = 1;
						}
					return result ;
				}
	public static ArrayList<String> showItemList(){
				return itemsList;
			}


	public static void welcomePhase(){

			System.out.println("""
			Welcome to Bustavo Store Where Can Add Item To List And Remove Items From Your List
				>>>>>> 1. To Add Item
				>>>>>> 2. To remove Item
				>>>>>> 3. To Show Available Items
				>>>>>> 0. To Exit
			Enter the Menu Number to Pick A menu 
				 """);
			}

	public static void userInterface(){
			Scanner input = new Scanner(System.in);
			//ArrayList<String> itemsList = new ArrayList<String>();
			welcomePhase();
			 int userInput = 0;
			do{
			userInput = input.nextInt();
			if(userInput != 0){
			switch(userInput){
				case 1 :
					System.out.println("Enter The Item You Want to add");
					String userItemInput = input.next();
					addItemToList(userItemInput);
					System.out.println("Item Added Successfuly/n Press 00 to go back");
					int innerInput = input.nextInt();
				break;

				case 2 :
					System.out.println("Enter The Item You Want to Remove");
					userItemInput = input.next();
					removeItemFromList(userItemInput);
					System.out.println("Item Removed Successfuly /n Press 00 to go back");
					innerInput = input.nextInt();
				break;

				case 3 :
					System.out.println(showItemList());
					System.out.println("Press 00 to go back");
					innerInput = input.nextInt();
				break;

				case 0 : System.out.println("Bye Bye See You Tommorow");
				break;
				default: 
					System.out.println("Invalid Input /n Press 00 to go back");
					innerInput = input.nextInt();
					}
						welcomePhase();
						}
					} while(userInput != 0);
			
				
		}





}