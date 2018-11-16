package com.epam.homework4seaBattle;

public class Main {
    public static void main(String[] args) {
        GameMap mapHuman = new GameMap(false);
        GameMap mapAI = new GameMap(true);
        mapAI.showMap();
        mapHuman.getCoordinatesForGame(mapHuman);
        mapAI.getCoordinatesForGame(mapAI);
        Thread shipBattle = new Thread(new Battle(mapHuman, mapAI));
        shipBattle.start();
    }
}
