package teme.ex2;

public class BT implements Bank{

    private int credit;

    BT(){
        this.credit=0;
    }
    @Override
    public String printSold() {
        return "" + credit;
    }

    @Override
    public int withdrawal(int withdrawalAmount) {
        if((credit>withdrawalAmount) && (withdrawalAmount>10)){
            credit = credit - withdrawalAmount;
            System.out.println("You have withdrawn " + withdrawalAmount);
        } else {
            System.out.println("Funds not available, error.");
        }
        return credit;
    }

    @Override
    public void deposit(int depositAmount) {
        if(depositAmount>5){
            credit+=depositAmount;
        }
        System.out.println("You have deposited "+ depositAmount +". Your credit is now "+ credit);

    }
    }
