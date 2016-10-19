package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class GameTest {

	@Test
	public void testCalculateOutPutBasedOnNames() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		int j = game.calculateOutPutBasedOnNames("Lisa", "Bromark");
		assertEquals("The result should be 0", j, 0);
		int k = game.calculateOutPutBasedOnNames("Lisa", "Mark");
		assertEquals("The result should be 2", k, 2);
	}

	@Test
	public void testCalculateOutPutBasedOnGender() {
		Game game2 = new Game();
		int i = game2.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
		int j = game2.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", j, 1);
		int k = game2.calculateOutPutBasedOnGender('T');
		assertEquals("The result should be 2", k, 2);
	}

	@Test
	public void testCalculateOutPutBasedOnAge() {
		Game game3 = new Game();
		int i = game3.calculateOutPutBasedOnAge(25);
		assertEquals("The result should be 0", i, 0);
		int j = game3.calculateOutPutBasedOnAge(30);
		assertEquals("The result should be 1", j, 1);

	}

	@Test
	public void testCalculateOutPutBasedOnHomeCity() {
		Game game4 = new Game();
		int a = game4.calculateOutPutBasedOnHomeCity("A");
		assertEquals("The result should be 0", a, 0);
		int b = game4.calculateOutPutBasedOnHomeCity("B");
		assertEquals("The result should be 1", b, 1);
		int c = game4.calculateOutPutBasedOnHomeCity("C");
		assertEquals("The result should be 2", c, 2);
		int d = game4.calculateOutPutBasedOnHomeCity("D");
		assertEquals("The result should be 3", d, 3);
		int e = game4.calculateOutPutBasedOnHomeCity("E");
		assertEquals("The result should be 4", e, 4);
		int f = game4.calculateOutPutBasedOnHomeCity("F");
		assertEquals("The result should be 5", f, 5);
		int g = game4.calculateOutPutBasedOnHomeCity("G");
		assertEquals("The result should be 6", g, 6);
		int h = game4.calculateOutPutBasedOnHomeCity("H");
		assertEquals("The result should be 7", h, 7);
		int i = game4.calculateOutPutBasedOnHomeCity("I");
		assertEquals("The result should be 8", i, 8);
		int j = game4.calculateOutPutBasedOnHomeCity("J");
		assertEquals("The result should be 9", j, 9);
		int k = game4.calculateOutPutBasedOnHomeCity("K");
		assertEquals("The result should be 10", k, 10);
	}

	@Test
	public void testGetGenderFromInputValues() {
		Game game5 = new Game();
		ArrayList<String> testArrayOfInputs = new ArrayList<String>();
		testArrayOfInputs.add("game5");
		testArrayOfInputs.add("Lisa");
		testArrayOfInputs.add("Bromark");
		testArrayOfInputs.add("F");
		game5.getGenderFromInputValues(testArrayOfInputs);
		assertEquals(testArrayOfInputs.get(3).charAt(0), 'F');

	}

	@Test
	public void testGetAgeFromInputValues() {
		Game game6 = new Game();
		ArrayList<String> testArrayOfInputs = new ArrayList<String>();
		testArrayOfInputs.add("game6");
		testArrayOfInputs.add("Lisa");
		testArrayOfInputs.add("Bromark");
		testArrayOfInputs.add("F");
		testArrayOfInputs.add("39");
		game6.getAgeFromInputValues(testArrayOfInputs);
		assertEquals(testArrayOfInputs.get(4), 39);

	}

	@Test
	public void testRunGame() {

		Game testGame = new Game();
		ResultFromInputs testResultFromInputs = new ResultFromInputs();

		testGame.runGame("testgame", "Lisa", "Bromark", 'F', 39, "Uppsala");
		testResultFromInputs.setResultForAge(39);
		assertEquals(39, testResultFromInputs.getResultForAge());

	}
	

}
