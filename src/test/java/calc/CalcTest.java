package calc;

import org.junit.Assert;
import org.junit.Test;


public class CalcTest {
	
	@Test
	public void test() {
		Calc calc = new Calc();
		Assert.assertEquals(calc.add(2, 2), 4, 0.001);      
	}
}
