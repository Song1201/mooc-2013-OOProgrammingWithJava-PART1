
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        Money sumMoney = new Money(this.euros+added.euros,this.cents+
                added.cents);
        return sumMoney;
    }
    
    public boolean less(Money compared) {
        int thisCents = 100*this.euros+this.cents;
        int comparedCents = 100*compared.euros+compared.cents;
        if (thisCents<comparedCents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            return new Money(0, 0);
        } else {
            return new Money(0, this.euros*100+this.cents-decremented.euros*100
            -decremented.cents);
        }
    }
}
