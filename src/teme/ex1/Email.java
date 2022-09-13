package teme.ex1;

import java.util.Scanner;

public class Email implements Advertiser{

    private int budget;
    private String name = "Email";

    @Override
    public void start() {
        System.out.println("Hello! Thank you for contacting " + name + ". You can choose your offer by calling the offer method.");

    }

    @Override
    public void compareOffer(int budget) {
        if (this.budget < (budget-(this.budget*10))){
            System.out.println("You can afford this");
        } else {
            System.out.println("You can not afford this");
        }

    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    @Override
    public void offer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What option do you want to choose?");
        System.out.println("Offer 1 costs 500$ and it affects 10,000 persons and you need 300 employees");
        System.out.println("Offer 2 costs 1500$ and it affects 30,000 persons and you need 400 employees");
        System.out.println("Offer 3 costs 15000$ and it affects 300,000 persons and you need 1500 employees");
        int offer = scanner.nextInt();
        switch (offer) {
            case 1 -> System.out.println("Offer 1 costs 500$ and it affects 10,000 persons and you need 300 employees");
            case 2 -> System.out.println("Offer 2 costs 1500$ and it affects 30,000 persons and you need 400 employees");
            case 3 -> System.out.println("Offer 3 costs 15000$ and it affects 300,000 persons and you need 1500 employees");
        }

    }

    @Override
    public void advertise() {
        System.out.println("Send emails.");
    }

    @Override
    public void checkNrOfEmployees(int nrRequired) {

    }
}
