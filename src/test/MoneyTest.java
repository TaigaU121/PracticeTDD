import main.Dollar;
import main.Franc;
import main.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5); // new がついていてエラーになってた.Money.dollarにnewインスタンス作る作業任せているので不要。
        System.out.println(five);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testEquality() {
        assertTrue (Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6))); //三角推量
        assertTrue (Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6))); //三角推量
        assertFalse(Money.franc(5).equals(Money.dollar(5))); // 5フランと5ドルは一緒であって欲しくない
        }
    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

}