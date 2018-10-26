package com.epam.classwork1strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FifthTask {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result;
        try {
            System.out.println("Enter the word");
            result = reader.readLine();
            char[] array = result.toCharArray();
            char a = array[1];
            array[1] = array[4];
            array[4] = a;
            result = "";
            for (char i: array) {
                result = result + i;
            }
        } catch (IOException e) {
            result = "Some problems with Input Data";
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                result = "Some problems with Stream";
            }
        }

        System.out.println(result);

    }
}
