package teme.ex1;

public class Company {
    public static void main(String[] args) {
         int budget = 100000000;
        Facebook facebook = new Facebook();
        facebook.start();
        facebook.offer();
        facebook.setBudget(20000);
        facebook.compareOffer(1000000);
        facebook.advertise();
    }


}
