package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckForCharacterTest {

    CheckForCharacter check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new CheckForCharacter();
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
    public void givenCharacter1ShouldReturnDesiredResult(){
        //arrange


        //act
        String result=check.checkforCharacter(';');

        //assert
        assertEquals("Character is a special symbol",result);
    }

    @Test
    public void givenCharacter2ShouldReturnDesiredResult(){
        //arrange

        //act
        String result=check.checkforCharacter('$');

        //assert
        assertEquals("Character is a special symbol",result);
    }

    @Test
    public void givenCharacter3ShouldReturnDesiredMessage(){
        //arrange

        //act
        String result=check.checkforCharacter('1');

        //assert
        assertEquals("Character is a digit",result);
    }

    @Test
    public void givenCharacter4ShouldReturnDesiredOutput(){
        //arrange

        //act
        String result=check.checkforCharacter('V');

        //assert
        assertEquals("Character is a capital letter",result);
    }

    @Test
    public void givenCharacter5ShouldReturnDesiredOutput(){
        //arrange

        //act
        String result=check.checkforCharacter('a');

        //assert
        assertEquals("Character is a small letter",result);
    }
}