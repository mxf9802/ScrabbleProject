package Mechanics;

/**
 * Created by Mohsin on 12/8/2019.
 */
public class Advantage {

    private int multiplier;

    private AdvantageType type;

    public Advantage(int multiplier, AdvantageType type) {
        this.multiplier = multiplier;
        this.type = type;
    }

    public Enum getType() {
        return type;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public enum AdvantageType {
        LETTER, WORD
    }

}