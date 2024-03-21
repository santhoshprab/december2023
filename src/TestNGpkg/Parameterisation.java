package TestNGpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {
	@Parameters ({"tool"})
	
	@Test
	public void parameter(String tool)
	{
		System.out.println("value = "+tool);
	}

}
