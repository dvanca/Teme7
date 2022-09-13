package teme.ex3;

public class Duck implements Animal{

    private int weight;

    @Override
    public String walk() {
        return "duck-walking";
    }

    @Override
    public String talk() {
        return "duck-talking";
    }

    @Override
    public String eat() {
        return "duck-eating";
    }
}
