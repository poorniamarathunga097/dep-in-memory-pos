package db;

import model.Customer;
import model.Item;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Customer> customerDataTable = new ArrayList<>();
    public static ArrayList<Item> itemDataTable = new ArrayList<>();

    static{
        customerDataTable.add(new Customer("C001","Gunapala","Panadura",25000));
        customerDataTable.add(new Customer("C002","Siripala","Colombo",100000));
        customerDataTable.add(new Customer("C004","Kiripala","Mathara",25000));

        itemDataTable.add(new Item("I001","Sugar",30,340.00));
        itemDataTable.add(new Item("I002","Milk",40,100.00));
        itemDataTable.add(new Item("I003","Chocolate",20,30.00));
    }
}
