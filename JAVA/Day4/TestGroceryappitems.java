import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class TestGroceryappitems{
	@Test
	public void checkThataddItemListaddItemtotheList(){
	Groceryappitems getItems = new Groceryappitems();
	String result = getItems.addItemToList("Cow");
	assertEquals(result , "Cow");
		}
	@Test
	public void checkIfaddItemListaddItemcontainstheInput(){
		Groceryappitems getItems = new Groceryappitems();
		String result = getItems.addItemToList("Bread");
		assertEquals(result , "Bread");
			
				}
	@Test
	public void checkIfaddItemListReturnTrue(){
		Groceryappitems getItems = new Groceryappitems();
		String result = getItems.addItemToList("Chicken");
		assertTrue(result == "Chicken" );
		}
	@Test
	public void checkifremoveItemFromListremoveelement(){
			Groceryappitems getItems = new Groceryappitems();
			String result = getItems.addItemToList("Chicken");
			int remove = getItems.removeItemFromList("Chicken");
			assertTrue(remove == 1);

			}
	@Test
	public void checkifremoveItemFromListremoveelementsecond(){
			Groceryappitems getItems = new Groceryappitems();
			String result = getItems.addItemToList("Goat");
			int remove = getItems.removeItemFromList("Goat");
			assertTrue(remove == 1);

			}
	@Test
	public void checkifremoveItemFromListremoveelementexpectedisequaltoresult(){
			Groceryappitems getItems = new Groceryappitems();
			String result = getItems.addItemToList("Goat");
			int remove = getItems.removeItemFromList("Goat");
			assertEquals(remove,1);

			}
	
	}


//java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest
//javac -cp "junit-platform-console-standalone-1.9.2.jar" Calculator.java CalculatorTest.java