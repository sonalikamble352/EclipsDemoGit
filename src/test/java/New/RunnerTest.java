package New;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnerTest 
{
	@Test
public void sumReturnsCorrectResult(){
	
		final int number1 =3;
		final int number2=5;
		final int expected=8;
		final int actual=Runner.sum(number1, number2);
		
		Assert.assertEquals(expected, actual);
}
	
}
