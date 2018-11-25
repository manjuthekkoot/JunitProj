package Package1;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest1 {

	@Test
	public void test() {
		
		String str = "First Test";
		Assert.assertEquals("First Test", str );
	}

}
