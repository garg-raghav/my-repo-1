import java.util.Scanner;

public class Car_Dealership {

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to the Car Dealership");
    }

    public static double getBudget(Scanner input) {
        System.out.print("Enter your budget in USD: ");
        return input.nextDouble();
    }

    public static void suggestCars(double budget) {
        System.out.println("\nCars available within your budget of " + budget + " USD:-->");

        boolean found = false;
 
        if (budget >= 18000) {
            System.out.println("Toyota Corolla - 18000 USD");
            System.out.println("Honda Fit - 17000 USD");
            System.out.println("Hyundai Accent - 16000 USD");
            found = true;
        }
        if (budget >= 23000) {
            System.out.println("Mazda3 - 23000 USD");
            System.out.println("Honda Civic - 22000 USD");
            System.out.println("Toyota Prius - 24000 USD");
            found = true;
        }
        if (budget >= 27000) {
            System.out.println("VolksWagen Passat - 27000 USD");
            System.out.println("Hyundai Sonata - 26000 USD");
            System.out.println("Kia Optima - 25000 USD");
            found = true;
        }
        if (budget >= 28000) {
            System.out.println("Toyota Camry - 28000 USD");
            System.out.println("Subaru Outback - 30000 USD");
            System.out.println("Nissan Altima - 31000 USD");
            found = true;
        }
        if (budget >= 35000) {
            System.out.println("Mazda MX-5 Miata - 35000 USD");
            System.out.println("Honda Accord - 34000 USD");
            System.out.println("Volkswagen Arteon - 37000 USD");
            found = true;
        }
        if (budget >= 42000) {
            System.out.println("Audi A4 - 43000 USD");
            System.out.println("BMW 3 Series - 42000 USD");
            System.out.println("Mercedes C-Class - 44000 USD");
            found = true;
        }
        if (budget >= 87000) {
            System.out.println("BMW 7 Series - 87000 USD");
            System.out.println("Mercedes S-Class - 94000 USD");
            System.out.println("Audi A8 - 85000 USD");
            found = true;
        }
        if (budget >= 150000) {
            System.out.println("Aston Martin Vantage - 150000 USD");
            System.out.println("McLaren 570S - 195000 USD");
            System.out.println("Lamborghini Huracan - 200000 USD");
            found = true;
        }
        if (budget >= 226000) {
            System.out.println("Ferrari Portofino - 226000 USD");
            System.out.println("Bentley Continental GT - 240000 USD");
            System.out.println("Rolls Royce Wraith - 250000 USD");
            found = true;
        }
        if (budget >= 300000) {
            System.out.println("McLaren 720S - 300000 USD");
            System.out.println("Rolls Royce Ghost - 311000 USD");
            System.out.println("Lamborghini Aventador - 500000 USD");
            found = true;
        }
        if (budget >= 460000) {
            System.out.println("Rolls Royce Phantom - 460000 USD");
            System.out.println("Ferrari SF90 Stradale - 625000 USD");
            System.out.println("Bugatti Bolide - 4700000 USD");
            found = true;
        }

        if (!found) {
            System.out.println("We do not have any cars in your budget. Please increase your budget or check out bikes at our other showroom.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayWelcomeMessage();
        double budget = getBudget(input);
        suggestCars(budget);

        input.close();
    }
}
