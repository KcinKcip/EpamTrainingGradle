package com.epam.homework4seaBattle;

import java.util.LinkedList;
import java.util.Random;

public class Ship {
    private Integer quantityOfShip = 3;
    Integer sizeOfShip;
    LinkedList<Coordinates> coordinates = new LinkedList<>();

    public Ship(Integer sizeOfShip){
        this.sizeOfShip = sizeOfShip;
    }

    void setShip(GameMap map){
        int random_coordinates = (int) (Math.random() * map.coordinates.size());
        map.value[map.coordinates.get(random_coordinates).x][map.coordinates.get(random_coordinates).y] = "█";
        coordinates.add(map.coordinates.get(random_coordinates));
        map.coordinates.remove(random_coordinates);
        sizeOfShip--;
        while (sizeOfShip!=0){
            int random_point = (int) (Math.random()*coordinates.size());
            if(coordinates.get(random_point).CoordinatesCheck(coordinates.get(random_point), map)){
                map.value[coordinates.get(random_point).CoordinatesMake(coordinates.get(random_point), map).x][coordinates.get(random_point).CoordinatesMake(coordinates.get(random_point), map).y] = "█";
                coordinates.add(coordinates.get(random_point).CoordinatesMake(coordinates.get(random_point), map));
                map.coordinates.remove((coordinates.get(random_point).CoordinatesMake(coordinates.get(random_point), map)));
                sizeOfShip--;
            }

        }
        for (Coordinates coordinate: coordinates) {
            coordinate.CoordinatesRemove(coordinate, map);
        }
    }




}
