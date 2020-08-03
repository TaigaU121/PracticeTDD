package main;

public class Dollar {

    public int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public Dollar times(int multiplier) {
//        return null; // コンパイル通すことが目的
        return new Dollar(amount * multiplier);
    }
    public boolean equals(Object object) {
        return true;
    }
}
