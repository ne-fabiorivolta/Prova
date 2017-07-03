package entity;

import java.util.Random;

/**
 * Created by nextre0029 on 30/06/2017.
 */
public interface Get_pensiero {

    default void getPensiero() {
        int pensiero1=0;
        int pensiero2=0;
        Random r = new Random();
        int i = 0;
        while (pensiero1 < 6 && pensiero2 < 8) {
            pensiero1 = r.nextInt(6);
            pensiero2 = r.nextInt(8);
            i++;

            if (pensiero1 == 5 && pensiero2 == 7) {
                System.out.println("get pensiero: " + pensiero1 + "." + pensiero2 + " numero di iterazioni: " + i);
                break;
            }
            System.out.println("getPensiero: " + pensiero1 + "." + pensiero2 + " numero di iterazioni: " + i);
        }
    }
}
