package Mechanics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohsin on 12/8/2019.
 */
public class ScrabbleBoard {

    private int threeWordAdvantageCount = 8;
    private int twoWordAdvantageCount = 16;

    private int threeLetterAdvantageCount = 12;
    private int twoLetterAdvantageCount = 24;

    private int numRows = 15;
    private int numCols = 15;

    private Tile[][] board;

    public ScrabbleBoard(boolean isStandardInitialization) {
        board = new Tile[numRows][numCols];
        initializeBoard(isStandardInitialization);
    }

    private void initializeBoard(boolean isStandardInitialization) {
        for (int i=0; i < numRows; i++) {
            for (int j=0; j < numCols; j++) {
                board[i][j] = new Tile(false);
            }
        }

        if (isStandardInitialization) {
            initializeDefaultBoard();
        } else {
            initializeRandomBoard();
        }
    }

    private void initializeRandomBoard() {


    }

    private void initializeDefaultBoard() {
        initWordAdvantage();
        initLetterAdvantage();
    }

    private void initLetterAdvantage() {
        initThreeLetterAdvantage();
        initTwoLetterAdvantage();
    }

    private void getScoreForWord(final String word, boolean isVertical, int row, int col) {

    }

    private void initTwoLetterAdvantage() {
        board[3][0].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[11][0].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[6][2].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[8][2].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[0][3].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[7][3].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[14][3].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[2][6].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[6][6].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[8][6].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[12][6].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[3][7].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[11][7].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[2][8].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[6][8].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[8][8].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[12][8].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[0][11].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[7][11].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[14][11].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[6][12].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[8][12].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

        board[3][14].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));
        board[11][14].setAdvantage(new Advantage(2, Advantage.AdvantageType.LETTER));

    }

    private void initThreeLetterAdvantage() {
        board[1][5].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[1][9].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));

        board[5][1].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[5][5].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[5][9].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[5][13].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));

        board[9][1].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[9][5].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[9][9].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[9][13].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));

        board[13][5].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
        board[13][9].setAdvantage(new Advantage(3, Advantage.AdvantageType.LETTER));
    }

    private void initWordAdvantage() {
        initThreeWordAdvantage();
        initTwoWordAdvantage();

    }

    private void initTwoWordAdvantage() {
        board[1][1].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[2][2].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[3][3].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[4][4].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[10][10].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[11][11].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[12][12].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[13][13].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));


        board[13][1].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[12][2].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[11][3].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[10][4].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[4][10].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[3][11].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[2][12].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));
        board[1][13].setAdvantage(new Advantage(2, Advantage.AdvantageType.WORD));


    }

    private void initThreeWordAdvantage() {
        board[0][0].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));
        board[0][7].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));
        board[0][14].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));

        board[7][0].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));
        board[7][14].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));

        board[14][0].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));
        board[14][7].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));
        board[14][14].setAdvantage(new Advantage(3, Advantage.AdvantageType.WORD));
    }
}
