package test.com.home.tom;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import com.home.tom.BugLogic;

public class RegreTest {
	BugLogic bug = new BugLogic();

	@Test
	public void testLessThanFive(){
		assertTrue(bug.lessThanFive(4));
	}

	@Test
	public void testLessThanFive2(){
		assertTrue(bug.lessThanFive(1));
	}


}
