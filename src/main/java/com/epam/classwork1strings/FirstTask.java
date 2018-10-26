package com.epam.classwork1strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result;
        try {
            System.out.println("Enter the word");
            result = reader.readLine();
            result = result.substring(2,3);
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
