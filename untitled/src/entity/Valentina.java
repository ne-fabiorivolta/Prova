package entity;

/**
 * Created by Rivolta Fabio on 30/06/2017.
 */
public class Valentina implements Get_pensiero {
    String nome;
    String cognome;
    int età;
    static Valentina valentina;

    private Valentina(){}

    public static Valentina creavale(){
        if(valentina==null){
            valentina= new Valentina();
        }
        return valentina;
    }

    public void litigio(Agatino v){
        Fabio f= Fabio.creafabio();
        f.litigare();
    }

}
