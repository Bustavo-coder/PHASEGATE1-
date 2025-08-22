// Create an empty container to store cars
// Have a fetures That Takes cars From The User If The Space Is empty accpet car if not tell the customer space takes
// Have a Feature That collect userPacking and check if cars is in space if there is car remove car if not tell no car in the current Space 
// Have a feature That Can Show The Customers Available Space In The Container
// Create a Welome Message for the user 
// Create a phase Where the user can interact with the recptionist in my case program

import java.util.Arrays;
import java.util.Scanner;
public class Parkingspace{
public static int [] space = new int [20];
public static void main(String [] args){
	userInterface();

	}

public static String parkCar(int input) {
	String message = "";
	if(space[input] == 0){
		space[input] = 1;
		message = "Car Parked Succesfuly";
			}
	else {
		message = "The Space Is Taken";
		}
		return message;
	} 


public static String removeCar(int input){
	String message = "";
	if(space[input] == 1){
		space[input] = 0;
		message = "Car Removed Succesfuly";
		}
	else {
		message = "Parking Space Is Empty";
			
		}
	return message;

	}

	public static String DisplayParkingSpace(){
		return Arrays.toString(space);

		}

	public static String userDisplayMessage(){
		String display = ("""
			Welcome To Bustavo Parking Space Wherby Cars Are Trusted With Maximum Security.
			Parking Is Made Easy.
			>>>>>.1 To Park Car
			>>>>>.2 To Remove Car 
			>>>>>.3 To Display Parking Space
			>>>>>.0 To Exit
				
			""");
		return display;

		}



	public static void userInterface(){

		Scanner input = new Scanner(System.in);
		System.out.println(userDisplayMessage());
			
			
			boolean breaktheLoop = true;
			while(breaktheLoop){
				System.out.println("Choose From the Options");
				int userInput = input.nextInt();

				switch(userInput){

					case 1 : 
						System.out.println("Enter The Space You Wish To Park we have 0-19 space pick your space");
						int parkingSpace = input.nextInt();


						if(parkingSpace < space.length &&  parkingSpace >= 0){
							String parkingMessage = parkCar(parkingSpace);
							System.out.println(parkingMessage);
							}
						else System.out.println("Invalid Parking Space");



						System.out.println("Enter 00 to go back to Main menu");
						int mainMenu = input.nextInt();
					break;

					case 2 :
						System.out.println("Enter Your Packing Space Number To Pick Your Car");
						parkingSpace = input.nextInt();



						if(parkingSpace <= space.length &&  parkingSpace >= 0){
							String removedmessage = removeCar(parkingSpace);
							System.out.println(removedmessage);
							}
							else System.out.println("Invalid Parking Space");



							System.out.println("Enter 00 to go back to Main menu");
							 mainMenu = input.nextInt();
					break;	

					case 3 :
							System.out.println(DisplayParkingSpace());


							System.out.println("Enter 00 to go back to Main menu");
							mainMenu = input.nextInt();
					break;	

					case 0 :	breaktheLoop = false;

					break;

					default :
						System.out.println("Invalid  menu");

						System.out.println("Enter 00 to go back to Main menu");
						mainMenu = input.nextInt();

							}

					System.out.println(userDisplayMessage());
					
					}
			


				}


		



}