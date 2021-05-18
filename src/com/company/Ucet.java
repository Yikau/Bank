package com.company;

public class Ucet {
    private User uzivatel;
    private int balance;

    public Ucet(User uzivatel) {
        this.balance = 0;
        this.uzivatel = uzivatel;
    }

    public void incBalance(int cash) {
        this.balance += cash;
    }

    public boolean decBalance(int cash) {
        if (this.balance - cash >= 0) {
            this.balance -= cash;
            return true;
        }
        return false;
    }

    public void sendBalance(Ucet account, int amount) {
        if (decBalance(amount)) {
            account.incBalance(amount);
        }
    }

    public User getUser()
    {
        return uzivatel;
    }

    public int getMoney() {
        return balance;
    }

    public void incBalanec(Ucet account, int money){
        account.incBalance(balance);
    }
    public void withDrawMoney(Ucet account, int money){
        account.decBalance(balance);
    }


}
