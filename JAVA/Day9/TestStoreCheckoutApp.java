import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStoreCheckoutApp{
	@Test
	public void CheckThatgetInputOfStringIsWorking(){
		StoreCheckoutApp userinput = new StoreCheckoutApp();
		System.out.println("Enter Ade to check if input is working");
		String result = userinput.getStringInput();
		assertEquals(result ,"Ade");
			}
	@Test
	public void CheckThatgetInputOfNumbersIsWorking(){
		StoreCheckoutApp userinput = new StoreCheckoutApp();
		System.out.println("Enter 100 to check if input is working");
		double result = userinput.getDoubleInput();
		assertEquals(result ,100);
			}
	@Test
	public void checkThatcalDiscountReturnCoorectResultwith8percetdiscount(){
		StoreCheckoutApp userinput = new StoreCheckoutApp();
		double value = 5000;
		System.out.println("Enter discount");
		double result = userinput.calDiscount(value);
		assertEquals(result,400.0);
			}
	@Test 
	public void checkThatcalVatreturnsCoorectResult(){
		double price = 4000;
		StoreCheckoutApp userinput = new StoreCheckoutApp();
		double result = userinput.getVat(price);
		assertEquals(result,300.0);
		}

	
		}



















//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java
