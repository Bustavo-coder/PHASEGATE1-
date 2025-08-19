import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAgeDiffrence{
	@Test
	public void checkIfFathersAgeISalreadyTwicetheSonAge(){
			// arrange
		int fathersAge = 50;
		int sonsAge = 10;
			//act 
		AgeDiffrence calculator = new AgeDiffrence();
		int result =  calculator.getageDiffrence(fathersAge,sonsAge);
			//assert
		assertEquals(result,30);
			}
	@Test
	public void checkIfFathersAgeISnotYeTwicetheSonAge(){
			// arrange
		int fathersAge = 25;
		int sonsAge = 15;
			//act 
		AgeDiffrence calculator = new AgeDiffrence();
		int result =  calculator.getageDiffrence(fathersAge,sonsAge);
			//assert
		assertEquals(result,5);
			}
		@Test
	public void checkIfFathersAgeequalsTwicetheSonAge(){
			// arrange
		int fathersAge = 20;
		int sonsAge = 10;
			//act 
		AgeDiffrence calculator = new AgeDiffrence();
		int result =  calculator.getageDiffrence(fathersAge,sonsAge);
			//assert
		assertEquals(result,0);
			}
		
		@Test
	public void checkIfFathersAgeislesserthanzero(){
			// arrange
		int fathersAge = -1;
		int sonsAge = 10;
			//act 
		AgeDiffrence calculator = new AgeDiffrence();
		int result =  calculator.getageDiffrence(fathersAge,sonsAge);
			//assert
		assertEquals(result,0);
			}

		@Test
	public void checkIfSonsAgeislesserthanzero(){
			// arrange
		int fathersAge = 15;
		int sonsAge = -10;
			//act 
		AgeDiffrence calculator = new AgeDiffrence();
		int result =  calculator.getageDiffrence(fathersAge,sonsAge);
			//assert
		assertEquals(result,0);
			}
	

	}


	
//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java
