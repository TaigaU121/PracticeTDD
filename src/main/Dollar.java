package main;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount; //amountは通貨共通の変数としてMoneyクラスへ
    }
    public Dollar times(int multiplier) {
//        return null; // コンパイル通すことが目的
        return new Dollar(amount * multiplier);
    }
}
