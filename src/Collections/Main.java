package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Sets and Lists are both an interface so i can't initialize them

public class Main {
    public static void main(String[] args) {
        //Set >> unique - unordered
        Set<Integer> set = new HashSet<>(5);
        /*(5) is the sze of the set but it can be changed or extended
        when i add more items*/

        set.add(1);
        set.add(2);
        //if i want to find those elements i need to use linear search

        for(int i: set){
            System.out.println(i);
       }
        /* that type of for loop is used when i want it to search
        the whole loop but im not interested in the beggining
        or the ending
         */

        /*List >> duplicated - ordered (lw 3ozt andh haga mo3ina higbha)
        34an el variables added wara b3d starting from 0 f lw 3aiza el haga
                f mkan x htb2a f x-1 */
        System.out.println("LIST");
        List<Integer> list = new ArrayList<>(5);
        list.add(0,2);
        list.add(1,5);
        list.add(2,90);
       // list.add(3,10);
        list.add(4);
        for(int i: list){
            System.out.println(i);
        }

        System.out.println(list.get(3));
    }
}
