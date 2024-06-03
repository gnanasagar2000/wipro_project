package com.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void sumTest() {
        App app = new App();
        int output = app.sum(5 ,4);
        assertEquals(9, output);
    }
        @Test
        public void checkEvenTest(){
            App app = new App();

            assertFalse(app.checkEven(3));
            assertTrue(app.checkEven(6));
            assertTrue(app.checkEven(22));
        }
    }