package com.ritik;

import java.util.LinkedList;
import java.util.Queue;

public class queueImpl {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.offer(11);
        que.offer(22);
        que.offer(13);
        que.offer(14);

        System.out.println(que);

        System.out.println(que.poll());

        System.out.println(que);

        System.out.println(que.peek());

    }
}
