package Mechanics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Mohsin on 12/8/2019.
 */
public class LetterBag {

    private int[] letterBag;

    private Random randomNumberGenerator;

    private boolean isBagEmpty;

    public LetterBag() {
        letterBag = new int[26];
        initLetterBag();
        randomNumberGenerator = new Random();
    }

    private void initLetterBag() {
        letterBag[0] = 9;
        letterBag[1] = 2;
        letterBag[2] = 2;
        letterBag[3] = 4;
        letterBag[4] = 12;
        letterBag[5] = 2;
        letterBag[6] = 3;
        letterBag[7] = 2;
        letterBag[8] = 9;
        letterBag[9] = 1;
        letterBag[10] =1;
        letterBag[11] = 4;
        letterBag[12] = 2;
        letterBag[13] = 6;
        letterBag[14] = 8;
        letterBag[15] = 2;
        letterBag[16] = 1;
        letterBag[17] = 6;
        letterBag[18] = 4;
        letterBag[19] = 6;
        letterBag[20] = 4;
        letterBag[21] = 2;
        letterBag[22] = 2;
        letterBag[23] = 1;
        letterBag[24] = 2;
        letterBag[25] = 1;

    }

    public List<Character> getRandomChars(int numCount) {
        List<Character> results = new ArrayList<>();
        int totalCharCount = 0;

        if (isBagEmpty) {
            return results;
        }

        for (int i=0; i < letterBag.length; i++) {
            totalCharCount += letterBag[i];
        }

        if (totalCharCount == 0) {
            isBagEmpty = false;
            return results;
        }

        if (numCount > totalCharCount) {
            for (int i=0; i < letterBag.length; i++) {
                for(int j=0; j<letterBag[i]; j++) {
                    results.add(convertChar(i));
                }
                letterBag[i] = 0;
            }
            return results;
        }
        for (int i=0; i<numCount; i++) {
            int randomIndex = randomNumberGenerator.nextInt(totalCharCount);
            results.add(getRandomChar(randomIndex));
            totalCharCount--;
        }
        return results;
    }

    private Character getRandomChar(final int randomIndex) {
        int currCount = 0;
        for (int i=0; i < letterBag.length; i++) {
            for (int j=0; j < letterBag[i]; j++) {
                if(randomIndex == currCount) {
                    letterBag[i]--;
                    return convertChar(i);
                }
                currCount++;
            }
        }
        throw new IllegalStateException("Unable to find the character in the bag for index:" + randomIndex);
    }

    private char convertChar(int val) {
        return (char)('A' + val);
    }

}
