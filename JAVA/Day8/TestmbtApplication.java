import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestmbtApplication{

@Test
	public void testUserInputwithzerovalue(){
		char value = '0';
		MbtiApplication mbti = new MbtiApplication();
		System.out.println("Enter 0 to check");
		char result = mbti.getInput();
		assertEquals(result,value);
		}
@Test
	public void testUserInputwithonevalue(){
		char value = '1';
		MbtiApplication mbti = new MbtiApplication();
		System.out.println("Enter this number 1 to check");
		char result = mbti.getInput();
		assertEquals(result,value);
		}
@Test
	public void checkThatValidationOfUsinputReturnscorretResult(){
		char value = '2';
		MbtiApplication mbti = new MbtiApplication();
		char result = mbti.validateUserInput(value);
		assertNotEquals(result,value);
			}

}
//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java

