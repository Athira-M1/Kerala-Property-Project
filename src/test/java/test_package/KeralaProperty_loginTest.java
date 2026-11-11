package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.KeralaProperty_BaseClass;

public class KeralaProperty_loginTest extends KeralaProperty_BaseClass {
	
	@Test(priority=1)
	public void title_verification()
	{
		String actual_title = obj.title_method();
		Assert.assertEquals(actual_title, "Post your Property - Login | Keralaproperty");
	}
	
	@Test(priority=2)
	public void login_validation()
	{
		obj.login_method("test1234@gmail.com", "test@123");
	}

}

