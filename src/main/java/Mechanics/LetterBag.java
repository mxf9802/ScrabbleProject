package Mechanics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Mohsin on 12/8/2019.
 */
public class LetterBag {

    private List<Character> allLetters;
    private int currIndex;

    private Random randomNumberGenerator;

    private boolean isBagEmpty;

    public LetterBag() {
        isBagEmpty = false;
        allLetters = new ArrayList<>();
        initLetterBag();
        randomNumberGenerator = new Random();
    }

    private void initLetterBag() {
        IntStream.range(0,9).forEach(val -> allLetters.add('A'));
        IntStream.range(0,2).forEach(val -> allLetters.add('B'));
        IntStream.range(0,2).forEach(val -> allLetters.add('C'));
        IntStream.range(0,4).forEach(val -> allLetters.add('D'));
        IntStream.range(0,12).forEach(val -> allLetters.add('E'));
        IntStream.range(0,2).forEach(val -> allLetters.add('F'));
        IntStream.range(0,3).forEach(val -> allLetters.add('G'));
        IntStream.range(0,2).forEach(val -> allLetters.add('H'));
        IntStream.range(0,9).forEach(val -> allLetters.add('I'));
        IntStream.range(0,1).forEach(val -> allLetters.add('J'));
        IntStream.range(0,1).forEach(val -> allLetters.add('K'));
        IntStream.range(0,4).forEach(val -> allLetters.add('L'));
        IntStream.range(0,2).forEach(val -> allLetters.add('M'));
        IntStream.range(0,6).forEach(val -> allLetters.add('N'));
        IntStream.range(0,8).forEach(val -> allLetters.add('O'));
        IntStream.range(0,2).forEach(val -> allLetters.add('P'));
        IntStream.range(0,1).forEach(val -> allLetters.add('Q'));
        IntStream.range(0,6).forEach(val -> allLetters.add('R'));
        IntStream.range(0,4).forEach(val -> allLetters.add('S'));
        IntStream.range(0,6).forEach(val -> allLetters.add('T'));
        IntStream.range(0,4).forEach(val -> allLetters.add('U'));
        IntStream.range(0,2).forEach(val -> allLetters.add('V'));
        IntStream.range(0,2).forEach(val -> allLetters.add('W'));
        IntStream.range(0,1).forEach(val -> allLetters.add('X'));
        IntStream.range(0,2).forEach(val -> allLetters.add('Y'));
        IntStream.range(0,1).forEach(val -> allLetters.add('Z'));

        currIndex = allLetters.size()-1;
        IntStream.range(0,2).forEach(val -> shuffle(allLetters));
    }

    private void shuffle(List<Character> allLetters) {
        int randomIndex;
        Character tempval;
        for (int i=0; i < allLetters.size(); i++) {
            randomIndex = randomNumberGenerator.nextInt(allLetters.size());
            tempval = allLetters.get(i);
            allLetters.set(i, allLetters.get(randomIndex));
            allLetters.set(randomIndex, tempval);
        }
    }

    public boolean isBagEmpty() {
        return isBagEmpty;
    }
    public List<Character> getRandomChars(int numCount) {

        if (isBagEmpty) {
            return new ArrayList<>();
        } else if(currIndex <= 0) {
            isBagEmpty = true;
            return new ArrayList<>();
        }

        List<Character> results = new ArrayList<>();
        while(currIndex > 0 && numCount > 0) {
            results.add(allLetters.get(currIndex));
            currIndex--;
            numCount--;
        }

        return results;
    }
}
