package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new VowelConsonant();
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
    public void givenString1ShouldReturnDesiredResult(){
        //arrange


        //act
        String result=check.VowelChecker("aeiou");

        //assert
        assertEquals("vowelvowelvowelvowelvowel",result);
    }

    @Test
    public void givenString2ShouldReturnDesiredResult(){
        //arrange

        //act
        String result=check.VowelChecker("sght");

        //assert
        assertEquals("consonantconsonantconsonantconsonant",result);
    }

    @Test
    public void givenString3ShouldReturnDesiredMessage(){
        //arrange

        //act
        String result=check.VowelChecker("this");

        //assert
        assertEquals("consonantconsonantvowelconsonant",result);
    }

    @Test
    public void givenString4ShouldReturnDesiredOutput(){
        //arrange

        //act
        String result=check.VowelChecker("ab");

        //assert
        assertEquals("vowelconsonant",result);
    }

    @Test
    public void givenString5ShouldReturnDesiredOutput(){
        //arrange

        //act
        String result=check.VowelChecker("AGHi");

        //assert
        assertEquals("vowelconsonantconsonantvowel",result);
    }

}