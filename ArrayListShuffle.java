/*
 (Shuffle ArrayList) Write the following method that shuffles an ArrayList:
 */
package arraylistshuffle;

import java.util.ArrayList;


public class ArrayListShuffle {

  
    public static void main(String[] args) {
        ArrayList<Integer> shufflelist = new ArrayList<>(); //Create Arraylist
        
        for (int i = 0; i < 10; i++) { //Int For loop
        shufflelist.add(i);
    }
        System.out.println(shufflelist);
        shuffle(shufflelist);                 //Print List
        System.out.println(shufflelist);
        
    }
           
         public static <E> void shuffle(ArrayList<E> sList){ //Shuffle Method

         for (int i = 0; i < sList.size(); i++) {
            int random = (int) (Math.random() * sList.size());
            E tmp = sList.get(random);
            sList.set(random, sList.get(i));
            sList.set(i, tmp);
             
             
        }
    }
}
    
