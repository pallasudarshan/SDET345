package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Contact {

	@Test
	public void createContact()
	{
		Assert.fail();
		System.out.println("Contact created");
	}
}
