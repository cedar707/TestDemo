package com.cms.ott;

import org.testng.annotations.Test;

public class ExceptionTest {
	 @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp="NullPoint")
	    public void testException(){
	        throw new IllegalArgumentException("NullPoint");
	    }
}
