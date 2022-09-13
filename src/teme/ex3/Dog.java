package teme.ex3;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "dog-walking";
    }

    @Override
    public String talk() {
        return "dog-talking";
    }

    @Override
    public String eat() {
        return "dog-eating";
    }
}
