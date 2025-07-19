package com.ritik;

import com.sun.security.jgss.InquireType;

import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;
import java.util.*;

public record Arraylist() {
    public static void main(String[] args) {
        System.out.println("** Arraylist **");

        ArrayList<Integer> list = new ArrayList<>(10);
        //add function
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        // 1. At a particular index
        list.add(1,15);


        ArrayList<Integer> newList = new ArrayList<>(10);
        newList.add(10);
        newList.add(22);
        newList.add(33);

        // 2. to add another Arraylist
        list.addAll(newList);

        // 3. Get element at a particular index
        System.out.println(list);
        System.out.println(list.get(2));

        // 4. To remove element at an index
        list.remove(2);
        System.out.println(list);

        // 5. To remove element
        list.remove(Integer.valueOf(10));

        System.out.println(list);
        // 6. delete all elements
//        list.clear();
        System.out.println(list);

        // 7. set - update at particular index
        list.set(1,100); // at O(1)
        System.out.println(list);

        // 8. Contains : find element
        System.out.println(list.contains(100));


        // Loops for Arraylist
        // accessing the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("element: " + list.get(i));
        }

        for (int ele : list) {
            System.out.println("For each : " + ele);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator : " + it.next());
        }


//        System.out.println(list.contains(11));
//
//        list.remove(2);
//
//        list.set(0,1919);
//        System.out.println(list);

//        Scanner sc = new Scanner(System.in);
//        int a = 99;
//        do {
//            System.out.println("Enter a number:");
//            a = sc.nextInt();
//            list.add(a);
//        }
//        while (a > 0);
//        System.out.println(list);
//        for (int i = 0; i < list.size();i++){
//            //get item at particular index
//            System.out.println(list.get(i));
//        }


    }
}
