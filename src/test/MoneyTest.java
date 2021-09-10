import main.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    /**
     * 곱셈 테스트
     */
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    /**
     * 객체 동일 테스트
     */
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
