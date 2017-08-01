package test.com.home.tom;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import com.home.tom.BugLogic;

public class BugLogicTest {

	@Test
	public void testLessThanFive(){
		BugLogic bug = new BugLogic();
		assertTrue(bug.lessThanFive(4));
	}
}
