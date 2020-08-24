package main;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount; //amountは通貨共通の変数としてMoneyクラスへ
    }
    public String currency() {
        return "USD";
    }
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
