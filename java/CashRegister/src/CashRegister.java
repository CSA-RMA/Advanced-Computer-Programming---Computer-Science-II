public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold
    public CashRegister() {
        cashInRegister=1000;
    }
    public double payEconomical(double cashGiven) {
        if(cashGiven>=2.5){
            cashInRegister=cashInRegister+2.5;
            economicalSold++;
            return cashGiven-2.5;
        }
        return cashGiven;
    }
    public double payGourmet(double cashGiven) {
        if(cashGiven>=4.0){
            cashInRegister=cashInRegister+4;
            gourmetSold++;
            return cashGiven-4;
        }
        return cashGiven;
    }
    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }

    boolean payGourmet(BevoCard card) {
        if(card.pay(4)) {
            cashInRegister=cashInRegister+4;
            gourmetSold++;
        }
        return card.pay(4);
    }

    boolean payEconomical(BevoCard card) {
        if(card.pay(2.5)) {
            cashInRegister=cashInRegister+2.5;
            economicalSold++;
        }
        return card.pay(2.5);
    }

    void loadMoneyToCard(BevoCard card, double sum) {
        if(sum>=0) {
            card.loadMoney(sum);
            cashInRegister=cashInRegister+sum;
        }
    }
}