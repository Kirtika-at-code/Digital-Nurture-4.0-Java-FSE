package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise4 {

    private static Calculator calc;

    @BeforeAll
    public static void setUpClass() {
        calc=new Calculator();
        System.out.println("Setup Complete");
    }
    @AfterAll
    public static void tearDownClass() {
        calc=null;
        System.out.println("Tear down Complete");
    }

    //A-A-A
    @Test
public void testAdd(){
        int a=10;
        int b=20;

        int result=calc.add(a,b);

        assertEquals(30,result);
    }

    @Test
    public void testSub(){
        int a=30;
        int b=20;

        int result=calc.sub(a,b);

        assertEquals(10,result);
    }

    @Test
    public void testMul(){
        int a=10;
        int b=20;
        int result=calc.mul(a,b);
        assertEquals(200,result);
    }

    @Test
    public void testDiv(){
        int a=20;
        int b=20;
        int result=calc.div(a,b);
        assertEquals(1,result);

    }
}
