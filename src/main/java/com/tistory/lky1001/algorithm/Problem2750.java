package com.tistory.lky1001.algorithm;

import java.util.Scanner;

/**
 * Created by soundllydev on 2016. 11. 15..
 */
public class Problem2750 {

    // https://www.acmicpc.net/problem/2750
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tot = scanner.nextInt();

        boolean numbers[] = new boolean[tot];

        for (int i = 0; i < tot; i++) {
            int readIn = scanner.nextInt();
            if (readIn <= 0 || readIn > tot) {
                i--;
                continue;
            }

            numbers[readIn-1] = true;
        }

        for (int i = 0; i < tot; i++) {
            if (numbers[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
