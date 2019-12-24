package Mechanics;

import AI.Dictionary;

import java.util.List;
import java.util.Set;

/**
 * Created by Mohsin on 12/8/2019.
 */
public class Game {

    public static void main(String[] args) {

        LetterBag letterBag = new LetterBag();
        Dictionary dictionary = new Dictionary();
        ScrabbleBoard board = new ScrabbleBoard(true);


        for (int i=0; i < 40; i++) {
            System.out.println(letterBag.getRandomChars(9));
        }


        //ScrabbleBoard board = new ScrabbleBoard(true);
//        System.out.println(board);

    }
}
