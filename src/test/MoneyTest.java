import main.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        /* amountが five.time(2),five.times(3)と上書きされることを防ぐため
         timesメソッドからproductという新しいオブジェクトを返すようにする */
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6))); //三角推量
        }

}