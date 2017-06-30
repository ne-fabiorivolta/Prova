package entity;

/**
 * Created by Rivolta Fabio on 30/06/2017.
 */
public class Agatino implements Get_pensiero {
    static Agatino agatino;


    private Agatino(){}

    public static Agatino creaaga(){
        if(agatino==null){
            agatino= new Agatino();
        }
        return agatino;
    }

    public void litigio(Valentina v){
        Fabio f= Fabio.creafabio();
        f.litigare();
    }
}
