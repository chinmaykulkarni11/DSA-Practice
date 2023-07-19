package com.dsa.practice.recurssion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(4));

    }

    private static int fib(int number) {
        return getFib(number);
    }

    private static int getFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return getFib(n - 1) + getFib(n - 2);

    }
}
