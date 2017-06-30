package entity;

import java.util.Random;

/**
 * Created by Rivolta Fabio on 30/06/2017.
 */
public class Fabio implements Get_pensiero {
    static Fabio fabio;


    private Fabio(){}

    public static Fabio creafabio(){
        if(fabio==null){
            fabio= new Fabio();
        }
        return fabio;
    }
    public void litigare(){
        Random r= new Random();
        int a= r.nextInt(3);
        String frase = null;
        String s="Perché litigateeee???";
        String s1="Non siamo più una famiglia???";
        String s2="State divorziando????";

        switch (a){
            case 0:
                frase=s;
                break;
            case 1:
                frase=s1;
                break;
            case 2:
                frase=s2;
                break;
        }
        System.out.println(frase);
    }
}
