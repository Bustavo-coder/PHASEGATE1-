import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
	public class TestParkingspace{
		@Test
		public void checParkCarIsWorkingIfparkacarInemptySpace(){
			int input = 5;
			Parkingspace getparkCar = new Parkingspace();
			String result =  getparkCar. parkCar(input);
			assertEquals(result , "Car Added Succesfuly");
			}
		@Test
		public void addaNewCarToTheFrontSpace(){
			int input = 12;
			Parkingspace getparkCar = new Parkingspace();
			String result =  getparkCar. parkCar(input);
			assertEquals(result , "Car Added Succesfuly");

				}
		@Test
		public void addaNewCarToTheSpace(){
			int input = 15;
			Parkingspace getparkCar = new Parkingspace();
			String result =  getparkCar. parkCar(input);
			assertEquals(result ,"Car Added Succesfuly");

				}
		@Test
		public void testRemoveCarAtIndex19(){
			int input = 19;
			Parkingspace getparkCar = new Parkingspace();
			String result =  getparkCar.removeCar(input);
			assertEquals(result ,   "Parking Space Is Empty");
			}
		@Test
		public void testRemoveCarAtIndex8(){
			int input = 8;
			Parkingspace getparkCar = new Parkingspace();
			String result =  getparkCar.removeCar(input);
			assertEquals(result ,   "Parking Space Is Empty");
			}





	}
















//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java