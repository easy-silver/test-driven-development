import main.Dollar;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    /**
     * 곱셈 테스트
     */
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.acount);
        product = five.times(3);
        assertEquals(15, product.acount);
    }
}
