package Chapter16_Collections;

import java.util.ArrayList;

public class Ch1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(5);
        l1.add(3);
        l1.add(1);
        l1.add(8);
        l1.add(4);

        l2.add(15);
        l2.add(13);
        l2.add(11);
        l2.add(18);
        l2.add(14);

        System.out.println(l1); // [5, 3, 1, 8, 13]

        System.out.println(l1.size()); // return size= 5

        System.out.println(l1.get(3)); // return element at index 3 = 8

        l1.add(2,9); // add 9 at index 2 but previous element not remove

        System.out.println(l2);

        System.out.println(l1);

        l1.addAll(3,l2); // add l2 collection's element in l1 at 3 index

        System.out.println(l1);

        System.out.println(l1.contains(6));  // return true or false

        System.out.println(l1.indexOf(9));  // return index of 9  = 2

        System.out.println(l1.indexOf(150));  // return -1 if false

        System.out.println(l1.remove(8)); // remove element at index 8


    }
}
