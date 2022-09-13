package teme.extra;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaDuble = new ArrayList<>();
        int [] lista = new int[]{8,7,2,5,3,1};
        for (int i = 0; i< lista.length; i++){
            for (int j=i+1;j< lista.length;j++){
                if  ((lista[i] + lista[j])==10){
                    listaDuble.add("(" + lista[i] + " , " + lista[j]+ ")");
                }
            }

        }
        System.out.println(listaDuble);

        ArrayList<String> listaTriple = new ArrayList<>();
        int[]lista2 = new int[]{8,7,2,5,3,1};
        for (int i=0; i< lista2.length;i++){
            for(int j=i+1; j<lista2.length-1; j++){
                for(int q=j+1; q<lista2.length-1;q++){
                    if((lista2[i]+lista2[j]+lista2[q] == 10)){
                        listaTriple.add("(" + lista2[i]+","+lista2[j]+","+lista2[q]);
                    }
                }
            }
        }

        System.out.println(listaTriple);
    }
}
