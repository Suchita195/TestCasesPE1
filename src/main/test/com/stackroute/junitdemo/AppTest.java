package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setup(){
        System.out.println("Before");
        app=new App();
    }
    @After
    public void teardown()
    {
        System.out.println("After");
        app=null;
    }
    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("Before");
    }
    @AfterClass
    public static void teardownAfterClass()
    {
        System.out.println("After");
    }
    @Test
    public void givenTwoStringsShouldReturnConcatenatedUpperString(){
        //arrange


        //act
        String result=app.concatAndConvertString("Suchita","KANCHHAL");

        //assert
        assertEquals("SUCHITAKANCHHAL",result);
    }

    @Test
    public void givenTwoNULLShouldReturnErrorMessage(){
        //arrange

        //act
        String result=app.concatAndConvertString(null,null);

        //assert
        assertEquals("Null not allowed",result);
    }

    @Test
    public void givenOneNullOneStringShouldReturnErrorMessage(){
        //arrange

        //act
        String result=app.concatAndConvertString("Suchita",null);

        //assert
        assertEquals("Null not allowed",result);
    }

    @Test
    public void givenOneEmptyStringOneNumericSringShouldReturnInputNumericString(){
        //arrange

        //act
        String result=app.concatAndConvertString("1996","");

        //assert
        assertEquals("1996",result);
    }

}