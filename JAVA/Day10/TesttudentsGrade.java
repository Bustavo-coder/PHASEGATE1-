import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesttudentsGrade{
	@Test
	public void checkthatCaluulateTotalScorereturnsCorrectResult(){
			int [] score = {2,3,4,5,7};
			StudentsGrade student = new StudentsGrade();
			int result = student.calculateTotalScoreOfStudents(score);
			assertEquals(result , 21);
			}
	@Test
	public void checkthatCaluulateTotalScorereturnsCorrectResultWithNegativeElement(){
			int [] score = {20,20,20,20};
			StudentsGrade student = new StudentsGrade();
			int result = student.calculateTotalScoreOfStudents(score);
			assertEquals(result , 80);
			}
	@Test
	public void checkthatCaluulateAverageScore(){
			int [] score = {20,20,20,20,};
			StudentsGrade student = new StudentsGrade();
			double result = student.calculateAverageScore(score);
			assertEquals(result , 20.0);
			}
	@Test
	public void checkthatCaluulateAverageScorewithMore(){
			int [] score = {20,20,20,20,20,50};
			StudentsGrade student = new StudentsGrade();
			double result = student.calculateAverageScore(score);
			assertEquals(result , 25.0);
			}



	}
//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java
