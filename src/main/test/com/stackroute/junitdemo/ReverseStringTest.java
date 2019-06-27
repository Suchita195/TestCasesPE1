package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new ReverseString();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        check=null;
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
    public void givenString1ShouldReturnReverseString(){
        //arrange

        //act
        String result=check.reverseString("java");

        //assert
        assertEquals("Reverse of the string:  avaj",result);
    }

    @Test
    public void givenString2ShouldReturnReverseString(){
        //arrange

        //act
        String result=check.reverseString("abc");

        //assert
        assertEquals("Reverse of the string:  cba",result);
    }

    @Test
    public void givenString3ShouldReturnReverseString(){
        //arrange

        //act
        String result=check.reverseString("suchita");

        //assert
        assertEquals("Reverse of the string:  atihcus",result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.reverseString(null);

        //assert
        assertEquals("invalid",result);
    }



}