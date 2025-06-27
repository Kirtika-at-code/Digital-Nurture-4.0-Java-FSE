package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {

    @Test
    public void testAssertion(){


        assertEquals(7, 49/7);


        assertTrue(5 > 3, "5 is greater than 3");


        assertFalse(5 < 3, "5 is not less than 3");


        assertNull(null, "Should Be Null");


        assertNotNull("Hello", "Should not be null");
    }
}
