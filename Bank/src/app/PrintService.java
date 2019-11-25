package app;

import Account.BankAccount;
import data.Address;
import data.Balance;
import data.Person;

public class PrintService {


   public void printAccount(Person owner, Address address, Balance balance){
       printName(owner);
       printAddress(address);
       printBalance(balance);   }

    public void printName (Person person) {
        System.out.println(person.getName() + " " + person.getSurname() + " PESEL - " + person.getPesel());

    }
    public void printAddress(Address address) {
        System.out.println("ul. " + address.getStreet() + " " + address.getHouse() + "/" + address.getApartment());
        System.out.println(address.getPostcode() + " " + address.getTown());
    }
    public void printBalance(Balance balance) {
        System.out.println(balance.getBalance() + " PLN");
    }
}

