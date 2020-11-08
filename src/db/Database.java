package db;

import model.Customer;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Customer> customerDataTable = new ArrayList<>();

    static{
        customerDataTable.add(new Customer("C001","Gunapala","Panadura",25000));
        customerDataTable.add(new Customer("C002","Siripala","Colombo",100000));
        customerDataTable.add(new Customer("C003","Mathupala","Ragama",75000));
        customerDataTable.add(new Customer("C004","Kiripala","Mathara",25000));

    }
}
