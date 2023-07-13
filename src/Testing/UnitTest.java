package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import Users.GameService;

class UnitTest {

	@Test
	void test() {
		GameService sc = new GameService();
		assertNotNull(sc.viewAll());
//		fail("Not yet implemented");
	}
	@MethodSource("data")
	void test2(String result ,String input) {
		GameService sc = new GameService();
		assertEquals(result,sc.authorSearch(input));
		
	}
	
	public static Collection data() {
		return Arrays.asList(new Object[][] {{"Danny","SnowBird"},{"Ram","FreshFood"}});
	}

}
