package com.ritik;

import java.sql.ClientInfoStatus;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public record Arraylist() {
    public static void main(String[] args) {
        System.out.println("** Arraylist **");

        ArrayList<Integer> List = new ArrayList<>(10);
//        List.add(10);
//        List.add(12);
//        List.add(13);
//        List.add(14);
//        List.add(15);
//        System.out.println(List);
//
//        System.out.println(List.contains(11));
//
//        List.remove(2);
//
//        List.set(0,1919);
//        System.out.println(List);

        Scanner sc = new Scanner(System.in);
        int a = 99;
        do {
            System.out.println("Enter a number:");
            a = sc.nextInt();
            List.add(a);
        }
        while (a > 0);
        System.out.println(List);
        for (int i = 0; i < List.size();i++){
            //get item at particular index
            System.out.println(List.get(i));
        }

    }
}
