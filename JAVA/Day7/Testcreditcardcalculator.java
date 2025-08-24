import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testcreditcardcalculator{
	@Test
	public void checkUserinputReturnCorrectresult(){
		String value = "Name";
		Creditcardcalculator getInput = new Creditcardcalculator();
		String result = getInput.getUserInput();
		assertEquals(result ,value);
				
			}
	@Test
	public void testIsValidatedReturnResultTru(){
		String value = "1234567893222";
		Creditcardcalculator getInput = new Creditcardcalculator();
		boolean result = getInput. isValidated(value);
		assertTrue(result);
			}
	@Test
	public void testIsValidatedReturnFalsewithaletterFound(){
		String value = "1234567893A22";
		Creditcardcalculator getInput = new Creditcardcalculator();
		boolean result = getInput. isValidated(value);
		assertFalse(result);
			}
	@Test
	public void testIsValidatedReturnFalsewithvaluelengthNot13(){
		String value = "1234567893A2";
		Creditcardcalculator getInput = new Creditcardcalculator();
		boolean result = getInput. isValidated(value);
		assertFalse(result);
			}
	@Test
	public void testIsValidatedReturnFalsewithvaluelengthNot16(){
		String value = "1234567893A2aa";
		Creditcardcalculator getInput = new Creditcardcalculator();
		boolean result = getInput. isValidated(value);
		assertFalse(result);
			}
	@Test
	public void checkUsegetTypeOfCardIsVisa(){
		String value = "43215768";
		Creditcardcalculator getInput = new Creditcardcalculator();
		String result = getInput.getTypeOfCard(value);
		assertEquals(result ,"Visa Card");
				
			}
	@Test
	public void checkUsegetTypeOfCardIsDiscoverCards(){
		String value = "63215768";
		Creditcardcalculator getInput = new Creditcardcalculator();
		String result = getInput.getTypeOfCard(value);
		assertEquals(result ,"Discover Card");
				
			}
	@Test
	public void checkUsegetTypeOfCardIsMasterCard(){
		String value = "53215768";
		Creditcardcalculator getInput = new Creditcardcalculator();
		String result = getInput.getTypeOfCard(value);
		assertEquals(result ,"Master Card");
				
			}
	@Test
	public void checkUsegetTypeOfCardwithInvalideNumber(){
		String value = "123215768";
		Creditcardcalculator getInput = new Creditcardcalculator();
		String result = getInput.getTypeOfCard(value);
		assertEquals(result ,"Invalid Card");
				
			}
		@Test
	public void checkUsegetInput(){
		String value = "1234";
		Creditcardcalculator getInput = new Creditcardcalculator();
		char [] result = getInput.getArrayInput(value);
		char [] expected = {'1','2','3','4'};
		assertEquals(result ,expected);
				
			}
		@Test
		public void TestThatcheckValidateCardReturnresult(){
			char [] num = {'1','2','3','5','9'};
			Creditcardcalculator getInput = new Creditcardcalculator();
			int result = getInput.getSumOfCardNo(num);
			assertEquals(result,24);
				}
		@Test
		public void TestThatcheckValidateCardWithACardNo(){
			char [] num = {'4','3','8','8','5','7','6','0','1','8','4','0','2','6','2','6'};
			Creditcardcalculator getInput = new Creditcardcalculator();
			int result = getInput.getSumOfCardNo(num);
			assertEquals(result,75);
				}
		@Test
		public void TestthatCheckValidityReturnCorrectResultwithCorrectInput(){
			int value = 60;
		Creditcardcalculator getInput = new Creditcardcalculator();
		String result = getInput.checkCardValidity(value);
		assertEquals(result ,"Valid");
				
				}
		@Test
		public void TestthatCheckValidityReturnCorrectResultwithInCorrectInput(){
			int value = 75;
		Creditcardcalculator getInput = new Creditcardcalculator();
		String result = getInput.checkCardValidity(value);
		assertEquals(result ,"Invalid");
				
				}
		
	}














//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java

