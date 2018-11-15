import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SimpleTest{
	@Test
	public void Test1(){
		int a=2;
		int b=2;
		assertTrue(a+b==4);
	}
	
	@Test
	public void test2() {
		int a=2;
		int b=2;
		assertTrue(a+b<4);
	}
}


