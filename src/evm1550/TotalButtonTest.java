package evm1550;

import static org.junit.Assert.*;

import org.junit.Test;

public class TotalButtonTest {
	TotalButton tb=new TotalButton();
	
	@Test
	public void test() {
		
		assertEquals(5,tb.getNumberOfvoters());
		//fail("Not yet implemented");
	}

}
