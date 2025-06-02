// Bank.java
public class Bank {
    private String code;
    private String address;

    public void manages() {
        System.out.println("Bank is managing ATM and Debit Cards.");
    }

    public void ownss_to() {
        System.out.println("Bank owns the ATMs.");
    }
}

// ATM.java
public class ATM {
    private String location;
    private String managedBy;

    public void transaction() {
        System.out.println("ATM is processing transaction.");
    }

    public void identities() {
        System.out.println("ATM is identifying the user.");
    }
}

// Customer.java
public class Customer {
    private String name;
    private String address;
    private String dob;
    private String uid;

    public void owns() {
        System.out.println("Customer owns account and debit card.");
    }
}

// DebitCard.java
public class DebitCard {
    private String cardId;
    private String ownBy;

    public void access_to() {
        System.out.println("Debit card provides access to the account.");
    }
}

// Account.java
public class Account {
    protected String type;

    public void check_balance() {
        System.out.println("Checking account balance.");
    }
}

// SavingsAccount.java
public class SavingsAccount extends Account {
    private String accountId;

    public SavingsAccount() {
        this.type = "Savings";
    }
}

// CurrentAccount.java
public class CurrentAccount extends Account {
    private String accountId;

    public CurrentAccount() {
        this.type = "Current";
    }
}

// ATMTransactions.java
public class ATMTransactions {
    private String transactionId;
    private String date;
    private String type;

    public void update() {
        System.out.println("Updating transaction record.");
    }
}

// Withdrawal.java
public class Withdrawal {
    private double amount;

    public void withdraw() {
        System.out.println("Withdrawing amount: " + amount);
    }
}

// Transfer.java
public class Transfer {
    private double amount;
    private String accountId;

    public void transfer() {
        System.out.println("Transferring amount: " + amount + " to account: " + accountId);
    }
}

// PinGeneration.java
public class PinGeneration {
    private String accountType;

    public void pin_generate() {
        System.out.println("Generating PIN for account type: " + accountType);
    }
}