package com.company;

public class User {
    private String jmeno;
    private String nick;

    public String getJmeno(){
        return jmeno;
    }

    public String getNick(){
        return nick;
    }

    public User(String jmeno, String nick){
        this.jmeno = jmeno;
        this.nick = nick;
    }

    public void createAccount(bk bank) {
        bank.createNewAccount(this);
    }


}
