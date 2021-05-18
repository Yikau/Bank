package com.company;

import java.util.ArrayList;

public class bk {
    private ArrayList<Ucet> accounts;
    private String nazev;

    public void createNewAccount(User User){
        accounts.add(new Ucet(User));
    }

    public Ucet getAccountByName(User User){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUser().getJmeno().equals(User.getJmeno())){
                return accounts.get(i);
            }
        }
        return null;
    }

    public bk(String nazev) {
        this.accounts = new ArrayList<>();
        this.nazev = nazev;
    }

}
