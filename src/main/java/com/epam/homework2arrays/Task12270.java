package com.epam.homework2arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task12270 {
    public static String textWrite(int[][] massive, int width, int lenth) {
        return "" + massive[0][0] + massive[width-1][0] + massive[0][lenth-1] + massive[width-1][lenth-1];
    }
    private static int[][] massiveCreate(int width, int lenth){
        int[][] massive = new int[width][lenth];
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < lenth; j++) {
                massive[i][j] = rnd.nextInt(100);
            }
        }
        return massive;
    }
    private static void massiveShow(int[][] massive, int width, int lenth){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < lenth; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the width and the length of the array");
        int width;
        int lenth;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            width = Integer.parseInt(reader.readLine());
            lenth = Integer.parseInt(reader.readLine());
            int[][] massive = massiveCreate(width, lenth);
            massiveShow(massive, width, lenth);
            System.out.println(textWrite(massive, width, lenth));
        } catch (IOException e) {
            System.err.println("Some problems with input data");
        }
    }
}
