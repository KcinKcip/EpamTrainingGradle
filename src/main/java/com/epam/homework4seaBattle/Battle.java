package com.epam.homework4seaBattle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Battle implements Runnable {

    GameMap mapHuman;
    GameMap mapAI;

    public Battle(GameMap mapHuman, GameMap mapAI){
        this.mapHuman = mapHuman;
        this.mapAI = mapAI;
    }
    @Override
    public void run() {
        String input;
        Coordinates point;
        Boolean fireAI = false;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while(mapAI.coordinates.size()!=0 && mapHuman.coordinates.size()!=0){
                if(fireAI.equals(false)){
                    System.out.println("Enter the coordinate like 1:2 for example ");
                    input = reader.readLine();
                    point = new Coordinates(Integer.parseInt(input.split(":")[0]), Integer.parseInt(input.split(":")[1]));
                    System.out.println("Try to hit enemy ship on coordinate: " + point.x + ":" + point.y);
                    if(mapAI.containCoordinate(point)){
                        mapAI.value[point.x][point.y] = "X";
                        System.out.println("Nice shot! Try another one");
                        mapAI.showMap();
                    } else if(!mapAI.value[point.x][point.y].equals("◊")){
                        System.out.println("Sorry, you already try to hit this coordinate! Try another");
                        mapAI.showMap();
                        continue;
                    }else{
                        mapAI.value[point.x][point.y] = "*";
                        fireAI = true;
                        System.out.println("Sorry, you missed. Now your enemy turn to hit");
                        mapHuman.showMap();
                    }
                    mapAI.removeCoordinate(mapAI, point);
                    //System.out.println(mapAI.coordinates.size());


                } else{
                    point = new Coordinates((int) (Math.random()*9)+1, (int) (Math.random()*9)+1);
                    System.out.println("AI try to hit " + point.x + ":" + point.y + " coordinate");
                    if(mapHuman.containCoordinate(point)){
                        System.out.println("Nice shot for AI");
                        mapHuman.value[point.x][point.y] = "X";
                        mapHuman.showMap();
                    } else if(!mapHuman.value[point.x][point.y].equals("◊")){
                        System.out.println("Double shot, try another");
                        mapHuman.showMap();
                        continue;
                    } else {
                        mapHuman.value[point.x][point.y] = "*";
                        fireAI = false;
                        System.out.println("AI missed. Your turn to attack");
                        mapAI.showMap();
                    }
                    mapHuman.removeCoordinate(mapHuman, point);
                    //System.out.println(mapHuman.coordinates.size());


                }
            }
            if(mapAI.coordinates.size()==0){
                System.out.println("You won!");
            } else {
                System.out.println("AI won!");
            }
        } catch (IOException e) {
            System.err.println("Some problem with input");;
        }

    }
}
