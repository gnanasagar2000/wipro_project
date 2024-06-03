package com.example;
package com.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void sumTest() {
        App app = new App();
        int a;
        int b;
        int output = app.sum(a:5 ,b:4);
        assertEquals(expected:9, output);

        @Test
        public void checkEvenTest(){
            App app = new App();

            assertFalse(app.checkEven(n:3));
            assertTrue(app.checkEven(output));
        }
    }
}
