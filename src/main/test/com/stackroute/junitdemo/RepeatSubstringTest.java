package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatSubstringTest {

    RepeatSubstring check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new RepeatSubstring();
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
        String result=check.repeatSubstring("suchita",3);

        //assert
        assertEquals("suchitaitaitaita",result);
    }

    @Test
    public void givenString2ShouldReturnDesiredResult(){
        //arrange

        //act
        String result=check.repeatSubstring("Stackroute",0);

        //assert
        assertEquals("Stackroute",result);
    }

    @Test
    public void givenString3ShouldReturnDesiredMessage(){
        //arrange

        //act
        String result=check.repeatSubstring("abcd",2);

        //assert
        assertEquals("abcdcdcd",result);
    }

    @Test
    public void givenString4ShouldReturnDesiredOutput(){
        //arrange

        //act
        String result=check.repeatSubstring(null,2);

        //assert
        assertEquals("invalid",result);
    }


}