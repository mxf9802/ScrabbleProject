package Mechanics;

/**
 * Created by Mohsin on 12/8/2019.
 */
public class Tile {

    private Advantage advantage;

    private boolean occupied;

    private Character letter;

    public Tile(boolean occupied) {
        this.occupied = occupied;
    }

    public Advantage getAdvantage() {
        return advantage;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public void setAdvantage(Advantage advantage) {
        this.advantage = advantage;
    }
}
