package main;

public class Dollar {

    private int amount; // amountを参照するクラスがDollarのみになったためprivateに変更
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
//        return null; // コンパイル通すことが目的
        return new Dollar(amount * multiplier);
    }
    public boolean equals(Object object) {
        Dollar dollar = (Dollar)object;
        return amount == dollar.amount;
    }
}
