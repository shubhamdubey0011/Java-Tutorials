package net.valtech.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo_1 {

    @BeforeSuite // 1
    public void beforeSuite()
    // Set up server or chrome properties related properties
    {
        System.out.println("From beforeSuite annotattion");
    }

    @BeforeClass
    public void beforeClassTEst() {
        // code related to Launch browser
        System.out.println("From beforeClass annotattion");
    }

    @BeforeMethod
    public void beforeMethod() {
        // other configuration or enter URL
        System.out.println("From beforeMethod annotattion");
    }

    @BeforeTest // 2
    public void beforeTest() {
        // Login related code snippet
        System.out.println("From beforeTest annotattion");
    }

    @Test
    public void testDemo1() {
        System.out.println("Validate sucessful login_1");
        System.out.println("actual verification");
    }

    @Test
    public void testDemo2() {
        System.out.println("Validate sucessful login_2");
        System.out.println("actual verification");
    }

    @AfterMethod
    public void afterMethodTest()

    {
        System.out.println("From afterMethod annotattion ,logout code snippet");
        // logout
    }

    @AfterTest
    public void afterTEst() {
        // deleteCookies
        System.out.println("From aftertest annotattion ,deleteCookies");
    }

    @AfterClass
    public void aferClass() {
        // browser tear down related code
        System.out.println("From afterClass annotattion, browser tear down related code");
    }

    @AfterSuite
    public void afterSuite()

    {
        // generate test reports
        System.out.println("From AfterSuite annotattion , generate test reports");
    }
}
