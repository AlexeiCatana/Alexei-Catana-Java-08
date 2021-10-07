package com.sci.week_five_JavaOOP2;

public class Main {

    public static void main(String[] args) {

        Phone phone = new Iphone13("156895656865644");

        phone.addContact(1, "0745123456", "Mihai", "Constantin");

        phone.addContact(2, "0745999999", "George", "Vlad");

        phone.listContacts();

        phone.sendMessage("0745123456", "Buna!");

        phone.listMessages("0745123456");

        phone.call("0745999999");

        phone.viewHistory();
    }
}
