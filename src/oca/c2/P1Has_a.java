package oca.c2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Account {
    private int accountNumber;
    private String accountName;
    private double balance;

    public Account(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

}

class Employee {
    private String name;
    private int employeeNumber;
    private double salary;
    Account account;

    public Employee(String name, int employeeNumber, double salary, Account account) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
        this.account = account;
    }

}

public class P1Has_a {
    public static void main(String[] args) {
        //DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        //DecimalFormat decimal = new DecimalFormat("#,##0.00", symbols);        

        Account account = new Account(12345, "John Doe", 10_000.0);
        Employee employee = new Employee("John Doe", 101, 50_000, account);

        System.out.println(account.getBalance());
        System.out.println(employee.account.getBalance());
        //System.out.println(decimal.format(employee.account.getBalance()));
    }

}
