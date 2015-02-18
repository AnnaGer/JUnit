import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import core.App;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
		// System.out.println("BeforeClass method will be executed before first test method starts");
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		// System.out.println("AfterClass method will be executed after last test method completed");
	}

	@Before
	public void setUp() throws Exception {
		// System.out.println("Before method will execute before every test method");
	}

	@After
	public void tearDown() throws Exception {
		// System.out.println("After method will execute after every test method");
	}

	@Test
	public void Test_01_assertEquals_Positive() {
		// System.out.println("Test_01_assertEquals_Positive");
		// String s = "ok";
		// assertEquals("failure - strings are not equal", "ok", s);
		assertEquals("String not the same", "Testing JUnit 4", App.s);
	}

	@Test
	public void Test_02_assertEquals_Negative() {
		// System.out.println("Test_02_assertEquals_Negative");
		// String s = "No";
		// assertEquals("failure - strings are not equal", "ok", s);
		assertEquals("String not the same.", "Testing TestNG 6", App.s);
	}

	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {
		// System.out.println("Test_03_assertEquals_Ignored");
		// String s = "No";
		// String a = "Maybe";
		// assertEquals("failure - strings are not equal", a, s);
		assertEquals("String not the same.", "Testing JUnit 3", App.s);
	}

	@Test
	public void Test_04_AssertSame_Positive() {
		// System.out.println("Test_04_AssertSame_Positive");
		// Integer i = 5;
		// assertSame("should be same", 5, i);
		assertSame("Integer not the same.", 55, App.i);
	}

	@Test
	public void Test_05_AssertSame_Negative() {
		// System.out.println("Test_05_AssertSame_Negative");
		// Integer i = 5;
		// Integer a = 6;
		// assertSame("should be same", a, i);
		assertSame("Integer not the same.", 54, App.i);
	}

	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {
		// System.out.println("Test_05_AssertSame_Negative");
		// Integer i = 5;
		// Integer a = 15;
		// assertSame("should be same", a, i);
		assertSame("Integer not the same.", 56, App.i);
	}

	@Test
	public void Test_07_assertFalse_Positive() {
		// System.out.println("Test_07_assertFalse_Positive");
		// Boolean f = false;
		// assertFalse("failure - should be false", f);
		assertFalse("Boolean should be false", App.f);
	}

	@Test
	public void Test_08_assertFalse_Negative() {
		// System.out.println("Test_08_assertFalse_Negative");
		// Boolean f = true;
		// assertFalse("failure - should be false", f);
		assertFalse("Boolean should be false", App.t);
	}

	@Test
	public void Test_09_assertTrue_Positive() {
		// System.out.println("Test_09_assertTrue_Positive");
		// Boolean t = true;
		// assertTrue("failure - should be true", t);
		assertTrue("Boolean should be true", App.t);
	}

	@Test
	public void Test_10_assertTrue_Negative() {
		// System.out.println("Test_10_assertTrue_Negative");
		// Boolean t = false;
		// assertTrue("failure - should be true", t);
		assertTrue("Boolean should be true", App.f);
	}

}