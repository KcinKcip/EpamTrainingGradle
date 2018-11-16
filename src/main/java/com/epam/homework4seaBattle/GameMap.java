package com.epam.homework4seaBattle;

import java.util.*;

class GameMap {

    private Boolean hide;
    String[][] value = new String[11][11];
    LinkedList<Coordinates> coordinates = new LinkedList<>();

    GameMap(Boolean hide) {
        this.hide = hide;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                value[i][j] = "◊";
            }
        }
        String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.arraycopy(letters, 0, value[0], 1, 10);
        for (int i = 1; i < 11; i++) {
            String[] numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            value[i][0] = numbers[i - 1];
        }
        getCoordinates(this);
        Ship[] ships = new Ship[]{new Ship(4), new Ship(3), new Ship(3), new Ship(2), new Ship(2), new Ship(2), new Ship(1), new Ship(1), new Ship(1), new Ship(1)};
        for (Ship ship : ships) {
            ship.setShip(this);
        }
    }

    void showMap() {
        if (!hide) {
            System.out.println("     ========== Your map ==========");
            System.out.println();
            for (String[] i : value) {
                for (String j : i) {
                    System.out.print(j + '\t');
                }
                System.out.println("");
            }
            System.out.println();
        } else {
            System.out.println("     ========== AI map ==========");
            System.out.println();
            for (String[] i : value) {
                for (String j : i) {
                    if (j.equals("█")) {
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

    private void getCoordinates(GameMap map) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (value[i][j].equals("◊")) {
                    coordinates.add(new Coordinates(i, j));
                }
            }
        }
    }

    void getCoordinatesForGame(GameMap map) {
        coordinates.removeAll(coordinates);
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (!value[i][j].equals("◊")) {
                    coordinates.add(new Coordinates(i, j));
                }
            }
        }
    }

    Boolean containCoordinate(Coordinates point) {
        for (Coordinates coordinates : this.coordinates) {
            if (coordinates.equals(point)) {
                return true;
            }
        }
        return false;
    }

    void removeCoordinate(GameMap map, Coordinates point) {
        map.coordinates.removeIf(coordinate -> coordinate.equals(point));
    }
}
