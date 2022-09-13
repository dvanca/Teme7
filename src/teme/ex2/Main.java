package teme.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank myBank;
        System.out.println("Alege Banca");
        System.out.println("1.ING");
        System.out.println("2.BT");
        if(scanner.nextInt()==1){
            myBank=new ING();
        } else {
            myBank= new BT();
        }

        boolean exit = false;
        while(!exit){
            System.out.println("""
                    Menu:\s
                    1.Sold Cont
                    2.Withdrawal
                    3.Deposit
                    4.Cancel Transaction
                    Alegeti optiunea:\s""");
            int optiune = scanner.nextInt();
            switch (optiune) {
                case 1 -> {
                    System.out.println("Soldul dumneavoastra este:");
                    System.out.println(myBank.printSold());
                }
                case 2 -> {
                    System.out.println("Ce suma doriti sa retrageti?");
                    myBank.withdrawal(scanner.nextInt());
                }
                case 3 -> {
                    System.out.println("Ce suma doriti sa depozitati?");
                    myBank.deposit(scanner.nextInt());
                }
                case 4 -> {
                    exit = true;
                    System.out.println("Goodbye");
                }
                default -> System.out.println("Error, please try different option1");
            }
        }

    }
}
