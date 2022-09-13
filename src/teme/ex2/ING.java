package teme.ex2;

public class ING implements Bank{

    private int credit;

     ING(){
        this.credit=0;
    }
    @Override
    public String printSold() {
        return null;
    }

    @Override
    public int withdrawal(int withdrawalAmount) {
        return 0;
    }

    @Override
    public void deposit(int depositAmount) {

    }
}
