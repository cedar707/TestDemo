package com.cms.ott;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration(locations={"application-context.xml"})  
@TransactionConfiguration(defaultRollback = true)  
public class TestNgTest extends AbstractTestNGSpringContextTests {  
      
    @Autowired  
    SafetyStockJob safetyStockJob;  
      
    @Test  
    public void test1(){  
        List<String> list=safetyStockJob.getFH_date();  
        System.out.println(1234);  
        System.out.println(list.toString());  
        System.out.println(list.size());  
    }  
}  