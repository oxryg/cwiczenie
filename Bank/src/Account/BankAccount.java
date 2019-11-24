package Account;

import data.*;

public class BankAccount {

    Person owner = new Person("Jan", "Kowal");
    Person owner1 = new Person("Paw", "Kusiak");
    Address address = new Address("Hel", "70-200", "Morska", "13");
    Address address1 = new Address("Starachowice", "27-200", "Hauke", "3", "38");
    Balance balance = new Balance(15256.50);
    Balance balance1 = new Balance(300);

    public BankAccount(Person owner, Address address, Balance balance) {
        this.owner = owner;
        this.address = address;
        this.balance = balance;
   }
}
