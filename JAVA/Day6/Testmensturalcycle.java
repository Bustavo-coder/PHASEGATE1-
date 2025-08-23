import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testmensturalcycle{
	@Test
	
	public void testcheckGetFirstPeriodDateReturnCorrectValue(){
		int date = 2;
		Mensturalcycle getDate = new Mensturalcycle();
		int result = getDate.getFirstPeriodDate(date);
		assertEquals(result,2);

			}
	@Test
	public void checktestgetCycleLength(){
		int firstDate = 2;
		int secondFirstDate = 26;
		Mensturalcycle getDate = new Mensturalcycle();
		int result = getDate. getCycleLength(firstDate,secondFirstDate);
		assertEquals(result,28);
			}
	@Test
	public void checktestgetOvulationDate(){
		int cycleLength = 28;
		Mensturalcycle getDate = new Mensturalcycle();
		int result = getDate.getOvulationDate(cycleLength);
		assertEquals(result,14);
			}
	@Test
	public void checktestisOvulationDate(){
		int cycleLength = 28;
		Mensturalcycle getDate = new Mensturalcycle();
		int result = getDate.getOvulationDate(cycleLength);
		assertTrue(result == 14);
			}
	@Test
	public void checktestgetFlowDate(){
		int getStopDate = 9;
		int startDate = 6;
		Mensturalcycle getDate = new Mensturalcycle();
		int result = getDate.getFlowDate(getStopDate,startDate);
		assertEquals(result , 3);
			}


	}























//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java




