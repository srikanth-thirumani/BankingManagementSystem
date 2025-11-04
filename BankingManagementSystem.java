import java.io.*;
import java.util.*;

class Account implements Serializable {
    private String accountNumber;
    private String name;
    private double balance;

    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Invalid deposit amount!");
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance or invalid amount!");
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber + " | Name: " + name + " | Balance: " + balance;
    }
}

public class BankingManagementSystem {
    private static final String FILE_NAME = "accounts.dat";
    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        loadAccounts();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Banking Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount(sc);
                case 2 -> deposit(sc);
                case 3 -> withdraw(sc);
                case 4 -> checkBalance(sc);
                case 5 -> displayAll();
                case 6 -> saveAccounts();
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    private static void createAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();
        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists!");
            return;
        }
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        accounts.put(accNo, new Account(accNo, name, balance));
        System.out.println("Account created successfully!");
    }

    private static void deposit(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();
        Account acc = accounts.get(accNo);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }
        System.out.print("Enter Amount to Deposit: ");
        double amt = sc.nextDouble();
        acc.deposit(amt);
        System.out.println("Deposit successful!");
    }

    private static void withdraw(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();
        Account acc = accounts.get(accNo);
        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }
        System.out.print("Enter Amount to Withdraw: ");
        double amt = sc.nextDouble();
        acc.withdraw(amt);
        System.out.println("Withdrawal processed!");
    }

    private static void checkBalance(Scanner sc) {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();
        Account acc = accounts.get(accNo);
        if (acc != null) System.out.println("Balance: " + acc.getBalance());
        else System.out.println("Account not found!");
    }

    private static void displayAll() {
        if (accounts.isEmpty()) System.out.println("No accounts found!");
        else accounts.values().forEach(System.out::println);
    }

    private static void saveAccounts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(accounts);
            System.out.println("Accounts saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }

    private static void loadAccounts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            accounts = (Map<String, Account>) ois.readObject();
        } catch (Exception e) {
            accounts = new HashMap<>();
        }
    }
}
