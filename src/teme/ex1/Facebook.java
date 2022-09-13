package teme.ex1;

import java.util.Scanner;

public class Facebook implements Advertiser{

    private int budget;
    private int numberOfEmployees = 4000;
    private String name = "Facebook";

    Facebook(){

    }

    Facebook(int budget, int numberOfEmployees){
        this.budget=budget;
        this.numberOfEmployees=numberOfEmployees;
        System.out.println(name);

    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
        System.out.println("Your allocated budget for" + name + " is " + budget);
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public void start() {
        System.out.println("Hello! Thank you for contacting " + getName()+ ". You can choose your offer by calling the offer method.");

    }
    @Override
    public void compareOffer(int budget){
        if (this.budget < (budget-(this.budget*10))){
            System.out.println("You can afford this");
        } else {
            System.out.println("You can not afford this");
        }
    }

    @Override
    public void offer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What option do you want to choose?");
        System.out.println("Offer 1 costs 5000$ and it affects 10,000 persons and you need 300 employees");
        System.out.println("Offer 2 costs 15000$ and it affects 30,000 persons and you need 400 employees");
        System.out.println("Offer 3 costs 150000$ and it affects 300,000 persons and you need 1500 employees");
        int offer = scanner.nextInt();
        switch (offer) {
            case 1 -> System.out.println("Offer 1 costs 5000$ and it affects 10,000 persons and you need 300 employees");
            case 2 -> System.out.println("Offer 2 costs 15000$ and it affects 30,000 persons and you need 400 employees");
            case 3 -> System.out.println("Offer 3 costs 150000$ and it affects 300,000 persons and you need 1500 employees");
        }
          ;
            }

    @Override
    public void advertise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What option are you going for? + 1 + 2 + 3?");
        int advertisementType = scanner.nextInt();
        switch(advertisementType){
            case 1:
                System.out.println("Send advertisements to 10,000 persons that showed interest in your product");
                break;
            case 2:
                System.out.println("Send advertisements to 30,000 persons that showed interest in your product");
                break;
            case 3:
                System.out.println("Send advertisements to 300,000 persons that showed interest in your product");
                break;
            default:
                System.out.println("This is an error");
        }
    }

    @Override
    public void checkNrOfEmployees(int nrRequired) {
        if (getNumberOfEmployees() > nrRequired){
            System.out.println("You have enough employees!");
        } else{
            System.out.println("You do not have enough employees");
        }

    }
}
