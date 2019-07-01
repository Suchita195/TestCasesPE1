package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class VerifyOriginalTest {

    VerifyOriginal check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new VerifyOriginal();
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
    public void givenString1ShouldReturnReverseString(){
        //arrange

        //act
        String result=check.verifyOriginal(23);

        //assert
        assertEquals("",result);
    }

    @Test
    public void givenString2ShouldReturnReverseString(){
        //arrange

        //act
        String result=check.verifyOriginal(78);

        //assert
        assertEquals("Reverse of the string:  cba",result);
    }

    @Test
    public void givenString3ShouldReturnReverseString(){
        //arrange

        //act
        String result=check.verifyOriginal(60);

        //assert
        assertEquals("Reverse of the string:  atihcus",result);
    }



}