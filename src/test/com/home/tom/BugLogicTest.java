package test.com.home.tom;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import com.home.tom.BugLogic;

public class BugLogicTest {
	BugLogic bug = new BugLogic();

	@Test
	public void testLessThanFive(){
		assertTrue(bug.lessThanFive(4));
	}

	@Test
	public void testLessThanFive2(){
		assertTrue(bug.lessThanFive(1));
	}

	@Test
	public void testLessThanFive4(){
		assertTrue(bug.lessThanFive(0));
	}

	@Test
	public void testLessThanFive5(){
		assertTrue(bug.lessThanFive(5));
	}

	@Test
	public void testLessThanFive6(){
		assertTrue(bug.lessThanFive(6));
	}

}
