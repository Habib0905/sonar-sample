package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void testAddNumbers() {
        assertEquals(8, App.addNumbers(3, 5));
    }
}

