package com.company;

public class Main {

    public static void main(String[] args) {
	bk bankashow = new bk("ČSOB");
	bk bankashow2 = new bk("Komerčka");
	User usershowcase = new User("Samuel", "GOD");
	User usershowcase2 = new User("Jakub", "Yikau");
    usershowcase.createAccount(bankashow);
    usershowcase2.createAccount(bankashow2);

        System.out.println(usershowcase.getJmeno() + " vložil 500 korun na účet" );
        bankashow.getAccountByName(usershowcase).decBalance(500);

        
    }
}
