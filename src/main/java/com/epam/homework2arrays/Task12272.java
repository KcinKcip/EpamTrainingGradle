package com.epam.homework2arrays;

import java.util.Random;

public class Task12272 {

    private static String textWriteA(char[][] massive, int width, int lenth) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if((i+j)%2 == 0){
                    result = result + massive[i][j];
                }
            }
        }
        return result;
    }
    private static String textWriteB(char[][] massive, int width, int lenth) {
        String result = "";
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if((i+j)%2 == 0){
                    result = result + massive[i][j];
                }
            }
        }
        return result;
    }
    private static char[][] massiveCreate(int width, int lenth){
        char[][] massive = new char[width][lenth];
        char[] symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < lenth; j++) {
                massive[i][j] = symbols[rnd.nextInt(25)];
            }
        }
        return massive;
    }
    private static void massiveShow(char[][] massive, int width, int lenth){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < lenth; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int width = 5;
        int lenth = 5;
        char[][] massive = massiveCreate(width, lenth);
        massiveShow(massive, width, lenth);
        System.out.println(textWriteA(massive, width, lenth));
        System.out.println(textWriteB(massive, width, lenth));
    }
}
