import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test_task_three{
	@Test
public static void CheckIfgetAmountOfLikesReturnsCorrectsResult(){
			String [] name = {"Ade","Yemi","Qudus"};
			//act 
		task_three getLikes = new task_three();
		String expected = name[0] + " , " + name[1] +" and " + name[2] + " Likes This";
		String result = getLikes.getAmountOfLikes(name);
			//assert
		assertEquals(result, expected);
			}
	
		}

	




//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java