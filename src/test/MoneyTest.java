import main.Dollar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    /**
     * 곱셈 테스트
     */
    @Test
    void testMultiplication() {
        //given
        Dollar five = new Dollar(5);
        //when
        five.times(2);

        //then
        Assertions.assertEquals(10, five.amount);
    }
}
