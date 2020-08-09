package main;

public class Money {
    protected int amount; //アクセス修飾子 protected は同一クラス、同一パッケージ、サブクラスから参照できる
    public boolean equals(Object object) { // equals の引数にObject型を入れることでMoney型にキャストしたのちに金額を返す
        Money money = (Money)object;
        return amount == money.amount;
    }
}
