import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class StoreCheckoutApp{
	public static Scanner input = new Scanner (System.in);
	public static ArrayList<String> itemList = new ArrayList<String> ();
	public static ArrayList<Double> priceList = new ArrayList<Double> ();
	public static ArrayList<Integer> quatityList = new ArrayList<Integer> ();
	public static LocalDateTime date = LocalDateTime.now();
	public static void main(String [] args){
		System.out.println("What is the customers Name");
		String name = getStringInput();

		String control = "Yes" ;
		do{
		 askUserQuestion();
		System.out.println("Add More Item");
		control = input.next();
		if(control.equalsIgnoreCase("No")) break;
		}while(true);

		System.out.println("What is your Name");
		String casherirName = getStringInput();

		System.out.println("How Much Discount will you get");
		double discount = getDoubleInput();

		header();

		System.out.println("\t\tCashier :" + casherirName);
		System.out.println("\t\tCustomer :" + name);
		 double totalSum = middle();

		System.out.println("\t\tThis Is Not a receipt Kindly Pay");
		System.out.println("How Much did he give you ");
		int userPayment = input.nextInt();
		for(int i = 0; i < 2; i++)printlin();
		header();middle();
		System.out.printf("%75s\t\t%d\n", "Amount Paid" ,userPayment );
		double balance =  userPayment - totalSum;
		System.out.printf("%75s\t\t%f\n", "Balance" ,balance);
		for(int i = 0; i < 2; i++)printlin();
		System.out.println("\t\tThank You For Your Patronage");

			}

	public static String getStringInput(){
		String userInput = input.next();
		return  userInput;
		}
	public static Double getDoubleInput(){
		double userInput = input.nextDouble();	
		return userInput;
		}
	public static void addItemToListItem(String item ){
		itemList.add(item);
		}
	public static void addPriceToPriceList(double price){
		priceList.add(price);
		}
	public static void addQuantitytoList(int qty){
		quatityList.add(qty);
		}
	
	public static double calDiscount(int discountpercent,double totalPrice){	
		double discount = (discountpercent * totalPrice) / 100;
		return discount;
	}
	public static double getVat(double subtotal){
		double vat = (7.5 * subtotal) / 100;
		return vat;
			}

	public static void askUserQuestion(){
		System.out.println("What did the customer Buy");
		String item = getStringInput();
		System.out.println("How Many peice");
		int peices = input.nextInt();
		System.out.println("How much per piece");
		double price = getDoubleInput();
		
		addPriceToPriceList(price);
		addItemToListItem(item);
		addQuantitytoList(peices);
			}


	public static void header(){
		System.out.println("\t\tSEMICOLON STORES");
		System.out.println("\t\tMain BRANCH");
		System.out.println("\t\tLOCATION:312,HERBERT MACURLAY WAY,SABO YABA, LAGOS.");
		System.out.println("\t\t08021804260657");
		System.out.println("\t\tDate " + date);
			}
	public static void printlin(){
		System.out.println("\t\t----------------------------------------------------------------------------------------");
		}
	public static double middle(){
		for(int i = 0; i < 3; i++)printlin();
		System.out.printf("%28s\t\t%s\t\t%s\t\t%s\n","Item","Qty","Price" ,"TOTAL(NGN)");
		printlin();
		double totalSum = 0;
		for(int count = 0; count < priceList.size();count++){
			double totalperUnit = quatityList.get(count) * priceList.get(count);
			 totalSum +=  totalperUnit;
			System.out.printf("%27s\t\t%d\t\t%f\t\t%f\n", itemList.get(count) ,quatityList.get(count),priceList.get(count),totalperUnit);
				}
			printlin();
			System.out.printf("%80s\t%f\n", "Sub Total" , totalSum );
			System.out.printf("%77s\t\t%f\n", "Discount" ,  calDiscount(8,totalSum));
			System.out.printf("%79s\t\t%f\n", "Vat @ 7.5%" ,  getVat(totalSum));
			for(int i = 0; i < 2; i++)printlin();
			double billTotal =  totalSum + getVat(totalSum) - calDiscount(8,totalSum);
			System.out.printf("%75s\t\t%f\n", "Bill Total:" ,  billTotal);
			//for(int i = 0; i < 2; i++)printlin();
			return billTotal;
			
		}


	}
