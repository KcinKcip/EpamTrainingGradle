package com.epam.classwork1strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthTask {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result;
        int count = 0;
        try {
            System.out.println("Enter the word");
            result = reader.readLine();
            for (int i = 0; i < result.length()-1; i++) {
                if(result.substring(i,i+1).equals(result.substring(i+1,i+2))) {
                    count++;
                }
            }
            result = "" + count;
        } catch (IOException e) {
            result = "Some problems with Input Data";
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                result = "Some problems with Stream";
            }
        }

        System.out.println("Total count is " + result);

    }
}
