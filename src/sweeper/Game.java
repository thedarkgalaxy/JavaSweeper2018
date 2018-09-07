package sweeper;

/**
 * Created by Zotov Mikhail on 06.09.2018.
 */
public class Game {

    private Bomb bomb;
    private Flag flag;

    public Game(int cols, int rows, int bombs) {

        Ranges.setSize(new Coordinate(cols, rows));
        bomb = new Bomb(bombs);
        flag = new Flag();
    }

    public void start(){

        bomb.start();
        flag.start();
    }

    public Box getBox(Coordinate coordinate){
        if (flag.get(coordinate) == Box.OPENED)
        return bomb.get(coordinate);
        else return flag.get(coordinate);
    }

    public void pressLeftButton(Coordinate coordinate) {
        flag.setOpenedToBox(coordinate);
    }

    public void pressRightButton(Coordinate coordinate) {
        flag.setFlagedToBox(coordinate);
    }
}
