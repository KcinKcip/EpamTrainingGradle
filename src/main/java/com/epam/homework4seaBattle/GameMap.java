package com.epam.homework4seaBattle;

import sun.plugin.dom.core.CoreConstants;

import java.util.*;

public class GameMap {

    public Boolean hide;
    public String [][] value = new String[11][11];
    public String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    public String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public Ship[] ships = new Ship[]{new Ship(4), new Ship(3), new Ship(3), new Ship(2),new Ship(2), new Ship(2),new Ship(1), new Ship(1),new Ship(1), new Ship(1)};
    public LinkedList<Coordinates> coordinates = new LinkedList<>();

    public GameMap(Boolean hide) {
        this.hide = hide;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                value[i][j] = "◊";
            }
        }
        for (int i = 1; i < 11; i++) {
            value[0][i] = letters[i-1];
        }
        for (int i = 1; i < 11; i++) {
            value[i][0] = numbers[i-1];
        }
        getCoordinates(this);
        for (Ship ship: ships) {
            ship.setShip(this);
        }

    }
    public void showMap(){
        if(!hide) {
            System.out.println("     ========== Your map ==========");
            System.out.println();
            for (String[] i : value) {
                for (String j : i) {
                    System.out.print(j + '\t');
                }
                System.out.println("");
            }
            System.out.println();
        } else{
              System.out.println("     ========== AI map ==========");
              System.out.println();
//              for (int i = 0; i < 11; i++) {
//                  for (int j = 0; j < 11; j++) {
//                      value[i][j] = "◊";
//                  }
//              }
            for (String[] i : value) {
//                if(i[1].equals("A")){
//                    continue;
//                }
                for (String j : i) {
//                    if(j.equals("1")||j.equals("2")||j.equals("3")||j.equals("4")||j.equals("5")||j.equals("6")||j.equals("7")||j.equals("8")||j.equals("9")||j.equals("10")){
//                        continue;
//                    }
                    if(j.equals("█")) {
                        System.out.print("◊" + '\t');
                    } else {
                        System.out.print(j + '\t');
                    }
                }
                System.out.println("");
            }
            System.out.println();
        }
    }
    public void getCoordinates(GameMap map){
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if(value[i][j].equals("◊")){
                    coordinates.add(new Coordinates(i, j));
                }
            }
        }
    }
    public void getCoordinatesForGame(GameMap map){
        coordinates.removeAll(coordinates);
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if(!value[i][j].equals("◊")){
                    coordinates.add(new Coordinates(i, j));
                }
            }
        }
    }
    public Boolean containCoordinate(Coordinates point){
        for (Coordinates coordinates: this.coordinates) {
            if(coordinates.equals(point)){
                return true;
            }
        }
        return false;
    }
    public void removeCoordinate(GameMap map, Coordinates point){
        map.coordinates.removeIf( coordinate -> coordinate.equals(point));
    }
}
