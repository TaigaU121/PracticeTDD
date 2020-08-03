import main.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        /* amountが five.time(2),five.times(3)と上書きされることを防ぐため
         timesメソッドからproductという新しいオブジェクトを返すようにする */
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        }

}