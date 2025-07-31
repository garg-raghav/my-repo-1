import java.util.Scanner;

public class LibrarySystem {

    static String[] titles = new String[100];
    static String[] authors = new String[100];
    static String[] serial_no = new String[100];
    static int[] quantities = new int[100];
    static int bookCount = 0;

    public static void addBook(Scanner input) {
        System.out.print("Enter Title: ");
        titles[bookCount] = input.nextLine();

        System.out.print("Enter Author: ");
        authors[bookCount] = input.nextLine();

        System.out.print("Enter Serial_No.: ");
        serial_no[bookCount] = input.nextLine();

        System.out.print("Enter Quantity: ");
        quantities[bookCount] = input.nextInt();
        input.nextLine();

        bookCount++;
        System.out.println("Book added successfully.\n");
    }

    public static void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\nList of Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + titles[i] + " by " + authors[i] +
                               " | Serial_No.: " + serial_no[i] + " | Qty: " + quantities[i]);
        }
    }

    public static void searchBook(Scanner input) {
        System.out.print("Enter keyword (title or author): ");
        String keyword = input.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (titles[i].toLowerCase().contains(keyword) || authors[i].toLowerCase().contains(keyword)) {
                System.out.println(titles[i] + " by " + authors[i] +
                                   " | Serial_No.: " + serial_no[i] + " | Qty: " + quantities[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void issueBook(Scanner input) {
        System.out.print("Enter Serial_No. to issue: ");
        String Serial_no = input.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (serial_no[i].equals(Serial_no)) {
                if (quantities[i] > 0) {
                    quantities[i]--;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is out of stock.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void returnBook(Scanner input) {
        System.out.print("Enter Serial_No. to return: ");
        String Serial_no = input.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (serial_no[i].equals(Serial_no)) {
                quantities[i]++;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n====== Library Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(input);
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook(input);
                    break;
                case 4:
                    issueBook(input);
                    break;
                case 5:
                    returnBook(input);
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
