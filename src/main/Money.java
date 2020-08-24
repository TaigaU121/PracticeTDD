package main;

public abstract class Money {
    protected int amount; //アクセス修飾子 protected は同一クラス、同一パッケージ、サブクラスから参照できる
    /* 親クラスの型を定義した変数に子クラスのインスタンスを代入したときの挙動
    （http://masao6739.blog89.fc2.com/blog-entry-19.html
    */
    public abstract Money times(int multiplier);
    abstract public String currency();
    public boolean equals(Object object) { // equals の引数にObject型を入れることでMoney型にキャストしたのちに金額を返す
        Money money = (Money)object;
        return amount == money.amount
            && getClass().equals(money.getClass());
    }
    public static Money dollar(int amount) {
        return new Dollar(amount);
    }
    public static Money franc(int amount) {
        return new Franc(amount);
    }
}
