import entity.Agatino;
import entity.Get_pensiero;
import entity.Valentina;

import java.util.Random;

/**
 * Created by Rivolta Fabio on 30/06/2017.
 */
public class Main implements Get_pensiero {
    public static void main(String[] args) {

        Agatino aga = Agatino.creaaga();

        Random r = new Random();

        int pensiero1 = 0;
        int pensiero2 = 0;
        int i = 0;
        while (pensiero1 < 6 && pensiero2 < 8) {
            pensiero1 = r.nextInt(6);
            pensiero2 = r.nextInt(8);
            i++;
            aga.getPensiero(pensiero1, pensiero2);
            if (pensiero1 == 5 && pensiero2 == 7) {
                System.out.println("get pensiero: " + pensiero1 + "." + pensiero2 + " numero di iterazioni: " + i);
                break;
            }
            System.out.println("getPensiero: " + pensiero1 + "." + pensiero2 + " numero di iterazioni: " + i);
        }
    }
}
