package JUnit;
import static org.junit.Assert.*;

public class Test_Calc {
	public void test_Add(){
		Calc c = new Calc();
		int res = c.add(2, 5);
		if (7!= res){
			fail("ha-ha");
		}
	}
	
	public class Test_Calc2 {
		public void test_Add(){
			Calc c = new Calc();
			int res = c.add(2, 5);
			assertTrue(res == 7);
			assertTrue("error",res == 7);
			assertEquals(7, res);//for Objects better
			assertNull(new Object());
			assertNotNull(new Object());
		}
	}
}
