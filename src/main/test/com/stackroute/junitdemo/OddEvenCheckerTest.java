package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class OddEvenCheckerTest {
    OddEvenChecker check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new OddEvenChecker();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
    }
    @AfterClass
    public static void tearDownAfterClass()
    {
    }
    @Test
    public void givenIntegerShouldReturnSuccessMessage(){
        //arrange


        //act
        String result=check.OddEven(22);

        //assert
        assertEquals("Jerry",result);
    }

    @Test
    public void givenIntegerShouldReturnSucessMessage(){
        //arrange

        //act
        String result=check.OddEven(27);

        //assert
        assertEquals("Tom",result);
    }

    @Test
    public void givenIntehgerShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.OddEven(64);

        //assert
        assertEquals("Error",result);
    }

    @Test
    public void givenIntegerShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.OddEven(57);

        //assert
        assertEquals("Error",result);
    }


}