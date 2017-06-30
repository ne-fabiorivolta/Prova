package entity;

/**
 * Created by nextre0029 on 30/06/2017.
 */
public interface Get_pensiero {

   default void getPensiero(int pensiero1, int pensiero2) {
       if (pensiero1==5 && pensiero2==7) {
           System.out.println("Get Pensiero!");
       } else {
           System.out.println(" Sei una merdina ");
       }
   }
}
