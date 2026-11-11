package test_package;

import org.testng.annotations.Test;

import base_package.KeralaProperty_BaseClass;

public class KeralaProperty_HomeTest  extends KeralaProperty_BaseClass{
	
	@Test(priority=1)
	public void property_method()
	{
		home_obj.add_property_method();
	}
	

}
