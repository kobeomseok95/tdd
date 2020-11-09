package tdd.chapterOne;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getCurrency().equals(money.getCurrency());
    }

    public String getCurrency(){
        return this.currency;
    }

    public String toString(){
        return amount + " " + currency;
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    public Money reduce(String to){
        return this;
    }
}
