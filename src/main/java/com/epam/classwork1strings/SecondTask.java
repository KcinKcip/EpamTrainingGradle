package com.epam.classwork1strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result;
        try {
            System.out.println("Enter the word");
            result = reader.readLine();
            int i = result.length();
            result = result.substring(i-1,i);
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
