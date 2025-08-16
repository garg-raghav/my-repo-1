import java.util.Scanner; 

public class BankSystem {

    static final int MAX_ACCOUNTS = 100;
    static int accountCount = 0;

    static String[] accountNumbers = new String[MAX_ACCOUNTS];
    static String[] accountNames = new String[MAX_ACCOUNTS];
    static double[] balances = new double[MAX_ACCOUNTS];

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== BANK MANAGEMENT SYSTEM ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkAccount();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void createAccount() {
        if (accountCount >= MAX_ACCOUNTS) {
            System.out.println("Bank database full!");
            return;
        }
        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = input.nextLine();
        System.out.print("Enter Initial Deposit: ");
        double deposit = input.nextDouble();

        accountNumbers[accountCount] = accNo;
        accountNames[accountCount] = name;
        balances[accountCount] = deposit;
        accountCount++;

        System.out.println("Account created successfully!");
    }

    static void depositMoney() {
        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();
        int index = findAccount(accNo);

        if (index == -1) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        balances[index] += amount;
        System.out.println("Deposit successful. New Balance: " + balances[index]);
    }

    static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();
        int index = findAccount(accNo);

        if (index == -1) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount > balances[index]) {
            System.out.println("Insufficient balance!");
            return;
        }
        balances[index] -= amount;
        System.out.println("Withdrawal successful. New Balance: " + balances[index]);
    }

    static void checkAccount() {
        System.out.print("Enter Account Number: ");
        String accNo = input.nextLine();
        int index = findAccount(accNo);

        if (index == -1) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Account Number: " + accountNumbers[index]);
        System.out.println("Account Holder: " + accountNames[index]);
        System.out.println("Balance: " + balances[index]);
    }

    static int findAccount(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accountNumbers[i].equals(accNo)) {
                return i;
            }
        }
        return -1;
    }
}
