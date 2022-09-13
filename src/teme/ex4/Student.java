package teme.ex4;

import java.util.ArrayList;

public class Student {
    private String name;
    private String grade;
    static int totalAdaugati=0;

    Student(String name, String grade){
        this.name=name;
        this.grade=grade;
        listaNote.add(Integer.valueOf(grade));
        listaNume.add(name);
        totalAdaugati+=1;


    }


    public void getName(){
        System.out.println(name);
    }

    public void getGrade(){
        System.out.println(grade);
    }

    static ArrayList<Integer> listaNote = new ArrayList<>();
    static ArrayList<String> listaNume = new ArrayList<>();

    public  static int getAverageGrade(ArrayList<Integer> listaNote){
        int total =0;
        for(int a : listaNote){
            total=total+a;
        }
        return (total/totalAdaugati);
    }

    }
