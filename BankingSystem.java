public class BankingSystem {

    public static void main(String[] args) {
        Customer customer = new Customer("C001", "Sadia Rahman", "Dhaka", "017XXXXXXXX", "sadia@email.com");

        Account acc1 = new Account("A1001", "Savings", 15000.00, "2022-01-01");
        Account acc2 = new Account("A1002", "Current", 50000.00, "2023-05-10");

        customer.addAccount(acc1);
        customer.addAccount(acc2);

        acc1.deposit(5000);
        acc2.withdraw(10000);

        ATM atm = new ATM("ATM001", "Gulshan", "Active", 100000.00);
        ATMTechnician tech = new ATMTechnician("T001", "Rafiq", "019XXXXXXXX");
        tech.performMaintenance(atm);
    }
}

// ------------------ Core Classes ------------------

class Bank {
    private String bankID;
    private String name;
    private String address;
    private String phone;
    private String ifscCode;

    public Bank(String bankID, String name, String address, String phone, String ifscCode) {
        this.bankID = bankID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.ifscCode = ifscCode;
    }
}

class ATM {
    private String atmID;
    private String location;
    private String status;
    private double cashAvailable;

    public ATM(String atmID, String location, String status, double cashAvailable) {
        this.atmID = atmID;
        this.location = location;
        this.status = status;
        this.cashAvailable = cashAvailable;
    }

    public String getAtmID() {
        return atmID;
    }

    public void refillCash(double amount) {
        cashAvailable += amount;
    }

    public void showStatus() {
        System.out.println("ATM " + atmID + " at " + location + " is " + status + " with cash: " + cashAvailable);
    }
}

class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phone;
    private String email;

    private Account[] accounts = new Account[5];
    private int accountCount = 0;

    public Customer(String customerID, String name, String address, String phone, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void addAccount(Account acc) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = acc;
            System.out.println("Account added: " + acc.getAccountNumber());
        } else {
            System.out.println("Maximum account limit reached.");
        }
    }

    public String getName() {
        return name;
    }
}

class Account {
    private String accountNumber;
    private String accountType;
    private double balance;
    private String openedDate;

    public Account(String accountNumber, String accountType, double balance, String openedDate) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.openedDate = openedDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to " + accountNumber + ". New balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountNumber + ". Remaining balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance in " + accountNumber);
            return false;
        }
    }
}

class Transaction {
    private String transactionID;
    private String type;
    private double amount;
    private String date;
    private String status;

    public Transaction(String transactionID, String type, double amount, String date, String status) {
        this.transactionID = transactionID;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }
}

class ATMTechnician {
    private String technicianID;
    private String name;
    private String contact;

    public ATMTechnician(String technicianID, String name, String contact) {
        this.technicianID = technicianID;
        this.name = name;
        this.contact = contact;
    }

    public void performMaintenance(ATM atm) {
        System.out.println("Technician " + name + " is performing maintenance on ATM " + atm.getAtmID());
    }

    public void performRepair(ATM atm) {
        System.out.println("Technician " + name + " is repairing ATM " + atm.getAtmID());
    }
}