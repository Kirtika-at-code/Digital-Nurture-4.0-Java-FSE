package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
  @Test
  public void testAdd() {
    Calculator calc = new Calculator();
    int addResult = calc.add(5, 3);
    //assertEquals(8, addResult);
    assertEquals(5,2+3);

    assertNull(null, "Value should not be null");
    assertNotNull(new Object());

    int subResult=calc.sub(9,2);
    assertEquals(7, subResult);
    assertTrue(9>2,"Wrong Subtraction" );

    int mulResult=calc.mul(4,5);
    assertEquals(20, mulResult);

    int divResult =calc.div(49,7);
    assertEquals(7, divResult);


  }
}
