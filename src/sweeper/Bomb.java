package sweeper;

/**
 * Created by Zotov Mikhail on 06.09.2018.
 */
class Bomb {
    private Matrix bombMap;
    private int totalBombs;

    Bomb(int totalBombs){
        this.totalBombs = totalBombs;
        fixBombsCount();
    }

    void start(){
        bombMap = new Matrix(Box.ZERO);
        for (int j = 0; j < totalBombs;j++) {
            placeBomb();
        }
    }

    Box get(Coordinate coordinate){
        return bombMap.get(coordinate);
    }

    int getTotalBombs(){
        return totalBombs;
    }

    void fixBombsCount(){
        int maxBombs = Ranges.getSize().x * Ranges.getSize().y/2;
        if (totalBombs > maxBombs){
            totalBombs = maxBombs;
        }
    }

    void placeBombs(){

    }

    private void placeBomb() {

        while (true) {
            Coordinate coordinate = Ranges.getRandomCoordinate();
            if (Box.BOMB == bombMap.get(coordinate)) continue;
            bombMap.set(coordinate, Box.BOMB);
            incNumberAroundBomb(coordinate);
            break;

        }
    }

    private void incNumberAroundBomb(Coordinate coordinate){

        for (Coordinate around: Ranges.getCoordinatesAround(coordinate)){
            if (bombMap.get(around) != Box.BOMB) {
                   bombMap.set(around, bombMap.get(around).getNextNumberBox());
            }
        }
    }

}
