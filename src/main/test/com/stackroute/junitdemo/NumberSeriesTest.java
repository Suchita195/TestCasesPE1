package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class NumberSeriesTest {

    NumberSeries check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new NumberSeries();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before setup");
    }
    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("After teardown");
    }

    @Test
    public void givenInput1ShouldErrorMessage(){
        //arrange

        //act
        String result=check.numberSeries(0);

        //assert
        assertEquals("Invalid",result);
    }

    @Test
    public void givenInput2ShouldReturnResult(){
        //arrange

        //act
        String result=check.numberSeries(3);

        //assert
        assertEquals("122333",result);
    }

    @Test
    public void givenInput3ShouldReturnResult(){
        //arrange

        //act
        String result=check.numberSeries(5);

        //assert
        assertEquals("122333444455555",result);
    }

}