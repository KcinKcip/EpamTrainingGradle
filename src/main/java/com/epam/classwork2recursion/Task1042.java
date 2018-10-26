package com.epam.classwork2recursion;

public class Task1042 {
        private static Double pow(Double a, int n) {
            Double result= a;
            if(n>1) {
                result = result * pow(result, n-1);
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(pow(5.4, 3));
        }

}
