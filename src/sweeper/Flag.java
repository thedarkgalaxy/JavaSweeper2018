package sweeper;

/**
 * Created by Zotov Mikhail on 06.09.2018.
 */
class Flag {

    private Matrix flagMap;
    private int totalFlag;
    private int totalOfClosedBoxes;

    void start(){
        flagMap = new Matrix(Box.CLOSED);
        }



    Box get(Coordinate coordinate){return flagMap.get(coordinate);}

    void setOpenedToBox(Coordinate coordinate){
        flagMap.set(coordinate, Box.OPENED);
    }

    void setBombedToBox(Coordinate coordinate){}

    void toggleFlagedToBox(Coordinate coordinate){}

    void setNobombToFlagedSafeBox(Coordinate coordinate){}

    void setOpenedToClosedBombBox(Coordinate coordinate){}

    int getCountOffFlagedBoxesAround(Coordinate coordinate){return 0;}

    public void setFlagedToBox(Coordinate coordinate) {
        flagMap.set(coordinate, Box.FLAGED);
    }
}
