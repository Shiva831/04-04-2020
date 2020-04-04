package packone;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@Test
	public void demo() {
		System.out.println("Hello");
	}
	
	@Test
	public void start() {
		System.out.println("BYE");
	}
	@BeforeTest
	public void end() {
		System.out.println("jknk");
	}
	@BeforeSuite
	public void endd() {
		System.out.println("wejkfkewf");
	}

}
