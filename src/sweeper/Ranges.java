package sweeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zotov Mikhail on 06.09.2018.
 */
public class Ranges {
    private static Coordinate size;
    private static ArrayList<Coordinate> allCoordinates;
    private static Random random = new Random();


    public static void setSize(Coordinate _size){
        size = _size;
        allCoordinates = new ArrayList<>();
        for (int y = 0; y < size.y; y++){
            for (int x = 0; x < size.x; x++){
                allCoordinates.add(new Coordinate(x, y));
            }

        }

    }

    public static Coordinate getSize(){
        return size;
    }

    public static List<Coordinate> getAllCoordinates(){
        return allCoordinates;
    }

    public static ArrayList<Coordinate> getCoordinatesAround(Coordinate coordinate){
        Coordinate around;
        ArrayList<Coordinate> list = new ArrayList<>();
        for (int x = coordinate.x - 1; x <= coordinate.x + 1; x++){
            for(int y = coordinate.y - 1; y <= coordinate.y + 1; y++){
                if (inRange(around = new Coordinate(x,y))){
                    if (!around.equals(coordinate)){list.add(around);}
                }
            }
        }
        return list;
    }

    static Coordinate getRandomCoordinate(){
        return new Coordinate(random.nextInt(size.x), random.nextInt(size.y));
    }

    static boolean inRange(Coordinate coordinate){
        return coordinate.x >=0 && coordinate.x < size.x &&
                coordinate.y >=0 && coordinate.y < size.y;
    }

}
