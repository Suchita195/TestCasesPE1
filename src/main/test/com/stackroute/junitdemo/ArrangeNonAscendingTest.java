package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrangeNonAscendingTest {
    ArrangeNonAscending check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new ArrangeNonAscending();
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
    public void givenInput1ShouldReturnDesiredResult(){
        //arrange


        //act
        String result=check.arrangeNonAscending(123456);

        //assert
        assertEquals("Sorting elements in non-ascending order" +
                "654321" +
                "Sum of even nos is 12" +
                "False",result);
    }

    @Test
    public void givenInput2ShouldReturnDesiredResult(){
        //arrange

        //act
        String result=check.arrangeNonAscending(6);

        //assert
        assertEquals("Sorting elements in non-ascending order" +
                "6" +
                "Sum of even nos is 6" +
                "False",result);
    }

    @Test
    public void givenInput3ShouldReturnDesiredResult(){
        //arrange

        //act
        String result=check.arrangeNonAscending(42688);

        //assert
        assertEquals("Sorting elements in non-ascending order" +
                "88642" +
                "Sum of even nos is 28" +
                "True",result);
    }

    @Test
    public void givenInput4ShouldReturnDesiredResult(){
        //arrange

        //act
        String result=check.arrangeNonAscending(432568986);

        //assert
        assertEquals("Sorting elements in non-ascending order" +
                "988665432" +
                "Sum of even nos is 34" +
                "True",result);
    }


}