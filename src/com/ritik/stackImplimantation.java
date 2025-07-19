package com.ritik;

import java.util.Stack;

public class stackImplimantation {
    public static void main(String[] args) {
        Stack<String> nums = new Stack<>();

        nums.push("1");
        nums.push("2");
        nums.push("3");
        nums.push("4");

        System.out.println("stack:" + nums);

        System.out.println(nums.peek());

        nums.pop();

        System.out.println("Stack:" + nums);

        System.out.println(nums.peek());

    }
}
