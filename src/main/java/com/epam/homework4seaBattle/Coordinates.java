package com.epam.homework4seaBattle;

public class Coordinates {
    int x;
    int y;

    Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    Boolean CoordinatesCheck(Coordinates point, GameMap map){
        Coordinates point1 = new Coordinates(point.x+1, point.y);
        Coordinates point2 = new Coordinates(point.x-1, point.y);
        Coordinates point3 = new Coordinates(point.x, point.y+1);
        Coordinates point4 = new Coordinates(point.x, point.y-1);
        for (Coordinates coordinates: map.coordinates) {
            if(coordinates.equals(point1) || coordinates.equals(point2) || coordinates.equals(point3) || coordinates.equals(point4) ){
                return true;
            }
        }
        return false;
//        if(coordinateX == 0)
//        return map.value[coordinateX+1][coordinateY].equals("O")
//                || map.value[coordinateX-1][coordinateY].equals("O")
//                || map.value[coordinateX][coordinateY+1].equals("O")
//                || map.value[coordinateX][coordinateY-1].equals("O");
    }
    Coordinates CoordinatesMake(Coordinates point, GameMap map){
        Coordinates point1 = new Coordinates(point.x+1, point.y);
        Coordinates point2 = new Coordinates(point.x-1, point.y);
        Coordinates point3 = new Coordinates(point.x, point.y+1);
        Coordinates point4 = new Coordinates(point.x, point.y-1);

        for (Coordinates coordinates: map.coordinates) {
            if(coordinates.equals(point1) || coordinates.equals(point2) || coordinates.equals(point3) || coordinates.equals(point4) ){
                return coordinates;
            }
        }
        return point;
    }
    void CoordinatesRemove(Coordinates point, GameMap map){
        Coordinates point1 = new Coordinates(point.x+1, point.y);
        Coordinates point2 = new Coordinates(point.x-1, point.y);
        Coordinates point3 = new Coordinates(point.x, point.y+1);
        Coordinates point4 = new Coordinates(point.x, point.y-1);
        map.coordinates.removeIf( coordinate -> coordinate.equals(point1) || coordinate.equals(point2) || coordinate.equals(point3) || coordinate.equals(point4));
    }

    public boolean equals(Coordinates other) {
        return this.x == other.x && this.y == other.y;
    }
    public String toString(Coordinates coordinates){
        return coordinates.x + ":" + coordinates.y;
    }

//        int coordinateX = point.x;
//        int coordinateY = point.y;
//        if(map.value[coordinateX+1][coordinateY].equals("O")){
//            return new Coordinates(coordinateX+1, coordinateY);
//        }
//        if(map.value[coordinateX-1][coordinateY].equals("O")){
//            return new Coordinates(coordinateX-1, coordinateY);
//        }
//        if(map.value[coordinateX][coordinateY+1].equals("O")){
//            return new Coordinates(coordinateX, coordinateY+1);
//        }
//        else return new Coordinates(coordinateX, coordinateY-1);
//        }

    }
