package sweeper;

import java.util.Objects;

/**
 * Created by Zotov Mikhail on 02.09.2018.
 */
public class Coordinate {

    public int x;
    public int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate)) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x &&
                y == that.y;
    }

}
