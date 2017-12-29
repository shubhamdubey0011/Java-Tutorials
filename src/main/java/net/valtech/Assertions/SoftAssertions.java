package net.valtech.Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions 
{
	SoftAssert soft=new SoftAssert();
	
	@Test
    public void softAssertion(){
         
        soft.assertNull("assertion");
        System.out.println("We are using Soft assertion in this method,"
                + " so this line of code will also be executed even if "
                + "the assetion fails.Wherever we want to execute full "
                + "testcase/method, we should use SoftAssertion");
      soft.assertAll();
    }
}
