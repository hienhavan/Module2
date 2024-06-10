package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Automateds {
    @Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Automated instance = new Automated();
        int expResult = 2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
}
