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
				int [] swapped = swapPassword(password);
				int [] encrypted = getEncryption(swapped);
				System.out.println(Arrays.toString(encrypted));

				int [] encytPass = encrypted;
				int [] decryption =  getDecryption(encytPass);
				//decryption =  swapPassword(decryption);
				System.out.println(Arrays.toString(decryption));
				
				}

		
		public static int [] swapPassword(int [] passwordArray){
			for(int index = 0; index < 2;index++){
				int store = passwordArray[index];
				passwordArray[index] = passwordArray[index + 2];
				passwordArray[index + 2] = store;
			
						}
				return passwordArray;

				}
		
	public static int [] getEncryption(int [] userPassword){
			for (int index = 0; index < userPassword.length;index++){
				userPassword[index] = (userPassword[index] + 7) % 10;
				}
				return userPassword;
			}
	public static int [] getDecryption(int [] userPattern){
			for (int index = 0; index < userPattern.length;index++){
					System.out.print(userPattern[index]);
				userPattern[index] = (userPattern[index] + 7) % 10;
				}
				return userPattern;
			}
		
		

	}