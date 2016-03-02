package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEven() {
		int iIntegerTestValue = 3;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isEven();
		assertEquals("testIsEven() failed",bExpectedresult,bActualResult);
	
	}
	public void testIsOdd() {
		int iIntegerTestValue = 3;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isEven();
		assertEquals("testIsEven() failed",bExpectedresult,bActualResult);
	
	}
	public void testIsPrime() {
		int iIntegerTestValue = 13;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isEven();
		assertEquals("testIsEven() failed",bExpectedresult,bActualResult);
		
	}
}
