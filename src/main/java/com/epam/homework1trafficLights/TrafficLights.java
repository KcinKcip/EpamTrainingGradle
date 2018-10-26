package com.epam.homework1trafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLights {
        public static void main(String[] args) {
            System.out.println("Please, enter the time");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Double time;
            String result;
            try {
                time = Double.parseDouble(reader.readLine());
                time = time%7;
                if(time<0) {
                    result = "A negative number is entered";
                } else if(time>=0 && time<2) {
                    result = "At the moment the " + Colors.RED +  " light is on";
                }else if(time>=2 && time<5) {
                    result = "At the moment the " + Colors.YELLOW +  " light is on";
                }else if(time>=5 && time<=7) {
                    result = "At the moment the " + Colors.GREEN +  " light is on";
                }else {
                    result = "Some problems in the algorithm of the program";
                }
                System.out.println(result);
            } catch (Exception e) {
                System.err.println("Some problems with input data");
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Some problems with stream");
                }
            }
        }
}
