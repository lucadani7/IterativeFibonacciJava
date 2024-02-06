package com.lucadani;

import java.util.Scanner;

public class Main {
    static double convertMillisToSeconds(long val) {
        return (double) val / 1000;
    }
    static long fibo(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0, b = 1, i = 2, c;
        while (true) {
            c = a + b;
            if (i == n) {
                return c;
            }
            a = b;
            b = c;
            ++i;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        System.out.print("n = ");
        int n = scanner.nextInt();
        long resultFibo = fibo(n);
        System.out.println("fibo(" + n + ") = " + resultFibo);
        long endTime = System.currentTimeMillis();
        double totalTimeInSeconds = convertMillisToSeconds(Math.abs(startTime - endTime));
        System.out.println("fibo(" + n + ") calculation took " + totalTimeInSeconds + " seconds");
    }
}