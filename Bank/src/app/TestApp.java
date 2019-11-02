package app;

import Account.BankAccount;
import data.*;


public class TestApp {

    public static void main(String[] args) {

        Person owner = new Person("Jan", "Kowal");
        Address address = new Address("Hel", "70-200", "Morska", "13");
        Balance balance = new Balance(15256.50);
        BankAccount account = new BankAccount(owner,address,balance);

        account.printInfo();

    }
}
