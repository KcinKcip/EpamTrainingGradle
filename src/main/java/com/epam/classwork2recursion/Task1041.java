package com.epam.classwork2recursion;

public class Task1041 {
    private static int factorial(int n) {
        int result = 1;
        if(n>1) {
            result = n * factorial(n-1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Task1041.factorial(1));
    }
}
