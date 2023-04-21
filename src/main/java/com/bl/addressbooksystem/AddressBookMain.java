package com.bl.addressbooksystem;

public class AddressBookMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Address Book System Program.");
        Contacts obj = new Contacts("Akash", "Kumar", "Mahatma Gandhi Square", "Raipur", "Chattisgarh", 491228, 8830584633L, "akashbokde98@gmail.com");
        System.out.println(obj);
    }
}

