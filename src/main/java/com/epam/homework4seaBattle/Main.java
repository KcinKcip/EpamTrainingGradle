package com.epam.homework4seaBattle;

public class Main {
    public static void main(String[] args) {
//        GameMap map = new GameMap();
//        map.showMap();
//        System.out.println("Nothing else");
//        for (int i = 0; i < map.coordinatesX.size(); i++) {
//            System.out.println(map.coordinatesX.get(i) + ":" + map.coordinatesY.get(i));
//        }
        GameMap mapHuman = new GameMap(false);
        GameMap mapAI = new GameMap(true);


        //mapHuman.showMap();
        mapAI.showMap();

        mapHuman.getCoordinatesForGame(mapHuman);
        mapAI.getCoordinatesForGame(mapAI);
//        for (Coordinates coordinates: mapAI.coordinates
//                ) {
//            System.out.println(coordinates.x +":" + coordinates.y);
//
//        }

        Thread shipBattle = new Thread(new Battle(mapHuman, mapAI));
        shipBattle.start();

//        for (Coordinates coordinates: mapHuman.coordinates
//             ) {
//            System.out.println(coordinates.x +":" + coordinates.y);
//
//        }

        //System.out.println(ship1.coordinates.size());
//        map.showMap();
        //System.out.println(map.coordinates.size());
//        for (int i = 0; i < map.coordinates.size(); i++) {
//            System.out.println(map.coordinates.get(i).toString(map.coordinates.get(i)));
//        }
    }
}
