import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestSecondTask{
		@Test
	public void testThatGradeReturnCorrectResult(){
			// arrange
		int firstScore = 90;
		int secondScore = 80;
		int thirdScore = 70;
			// act
		SecondTask calgrade = new SecondTask();
		char result = calgrade.getGrade(firstScore,secondScore,thirdScore);
			//assert
		assertEquals(result,'B');
			
			}
	@Test
	public void testThatGradeReturnCorrectResultwith(){
			// arrange
		int firstScore = 20;
		int secondScore = 10;
		int thirdScore = 30;
			// act
		SecondTask calgrade = new SecondTask();
		char result = calgrade.getGrade(firstScore,secondScore,thirdScore);
			//assert
		assertEquals(result,'F');
			
			}

		
	
	}



//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java
