import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Firsttasktest{
	@Test
		public static void testSquareFunction(){
			int number = 2;		
			Firsttask squares = new Firsttask();
			int result = squares.getSquares(number);
			assertEquals(result , 4);

			}


	

	}





















//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java