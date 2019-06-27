package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class TotalOfNumbersTest {
    TotalOfNumbers total;
    @Before
    public void setUp(){
        System.out.println("Before");
        total=new  TotalOfNumbers();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        total=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before");
    }
    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("After");
    }

    @Test
    public void givenNumbersShouldReturnTotal(){
        //arrange

        //act
        String a[]={"14","67","33","9","0"};
        String result=total.TotalOfNumbers(a);

        //assert
        assertEquals("123",result);
    }

    @Test
    public void givenNumbers2ShouldReturnTotal(){
        //arrange

        //act
        String a[]={"6","8","9","6","8","0"};
        String result=total.TotalOfNumbers(a);

        //assert
        assertEquals("37",result);
    }

    @Test
    public void givenInputShouldReturnTotal(){
        //arrange

        //act
        String a[]={"5","6","7","S","0"};
        String result=total.TotalOfNumbers(a);

        //assert
        assertEquals("error",result);
    }



}