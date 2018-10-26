package com.epam.homework2arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task12273 {
    public static String textWrite(char[][] massive, int width, int lenth) {
        String result = "";
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < lenth; j++) {
                if(j%2 != 0){
                    result = result + massive[i][j];
                }
            }
            result = result + "\n";
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
        System.out.println("Enter the width and the length of the array");
        int width;
        int lenth;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            width = Integer.parseInt(reader.readLine());
            lenth = Integer.parseInt(reader.readLine());
        char[][] massive = massiveCreate(width, lenth);
        massiveShow(massive, width, lenth);
        System.out.println(textWrite(massive, width, lenth));
        } catch (IOException e) {
            System.err.println("Some problems with input data");
        }
    }
}
