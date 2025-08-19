import java.util.Scanner;
import java.util.Arrays;
public class Diffence1{
		public static void main(String [] args){
			int [] password = new int [4];
			Scanner input = new Scanner(System.in);
				for(int index = 0; index < password .length;index++){
					System.out.println("Enter The Password");
					password[index] = input.nextInt();
						}
				int [] storeSwap = swapPassword(password);
				System.out.println(getEncryption(storeSwap));
				}

	public static String getEncryption(int [] userPassword){
			String sum = "";
			for (int index = 0; index < userPassword.length;index++){
				int value = userPassword[index];
				 value = (value + 7) % 10;
				sum += value;

				}
				
				return sum;
			}

		public static int [] swapPassword(int [] userPassword){
			for(int index = 0; index < 2;index++){
				int store = userPassword[index];
				userPassword[index] = userPassword[index + 2];
				userPassword[index + 2] = store;
			
						}
				return userPassword;

				}

	}