import entity.Agatino;
import entity.Fabio;
import entity.Get_pensiero;
import entity.Valentina;

/**
 * Created by Rivolta Fabio on 30/06/2017.
 */
public class Main {
    public static void main(String[] args) {


        Valentina v=Valentina.creavale();
        Agatino a=Agatino.creaaga();

        a.litigio(v);
        v.litigio(a);



    }
}
