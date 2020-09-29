package net.valtech.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * @author sdubey ,code snippet is an example of listners usaage 
 *
 */
public class BaseTest {
    
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am in Before Method! Test is starting!");
    }
 
    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am in After Method! Test is ending!");
 
    }
}
