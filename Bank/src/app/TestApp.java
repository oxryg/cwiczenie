package app;

import Account.BankAccount;
import data.*;


public class TestApp {

    public static void main(String[] args) {

        Person owner = new Person("Jan", "Kowal");
        Person owner1 = new Person("Paw", "Kusiak");
        Address address = new Address("Hel", "70-200", "Morska", "13");
        Address address1 = new Address("Starachowice", "27-200", "Hauke", "3", "38");
        Balance balance = new Balance(15256.50);
        Balance balance1 = new Balance(300);

        BankAccount account = new BankAccount(owner, address, balance);
        PrintService printService = new PrintService();
        printService.printAccount(owner, address, balance);
        printService.printAccount(owner1, address1, balance1);
}
