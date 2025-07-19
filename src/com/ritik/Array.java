package com.ritik;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        System.out.println("** Arrays **");
        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
