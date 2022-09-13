package teme.ex4;

public class Main {
    public static void main(String[] args) {
        Student ion = new Student("Marcel Popescu","3");
        Student marcel = new Student("Marcel Popescu Enescu","7");
        Student andreea = new Student("Andrea Enescu","6");
        Student micu = new Student("Micu Calinescu","10");
        Student ionel = new Student("Ion Enescu","4");

        System.out.println(Student.listaNote);
        System.out.println(Student.listaNume);

        System.out.println(Student.getAverageGrade(Student.listaNote));
    }
}
