import java.awt.*;

/**
 * @author Joseph Brooksbank
 * @version 0.1 1/8/2018
 *
 * Class to store the "world" of the maze
 */

class Maze {
    /** The maze array itself */
    private char[][] mazeArray;
    /** The current row of the player */ //NOTE it would be slightly more efficient to use a point obj, but confusing
    private int playerRow;
    /** The current column of the player */
    private int playerCol;
    /** The number of rows in the "maze" */
    private int rows;
    /** The number of columns in the "maze" */
    private int columns;

    /**
     * The main constructor of the maze
     * @param rows           The rows of the maze
     * @param columns        The columns of the maze
     * @param startRow       The starting Row position of the player
     * @param startCol       The starting Col position of the player
     */
    Maze(int rows, int columns, int startRow, int startCol){
        mazeArray = new char[rows][columns];
        playerRow = startRow;
        playerCol = startCol;
        this.rows = rows;
        this.columns = columns;

        /* Initializing maze */
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (i == playerRow && j == playerCol)
                    mazeArray[i][j] = 'o';
                else
                    mazeArray[i][j] = ' ';
            }
        }
    }

    /**
     * Checks if move is valid
     * @param moveAttempt       The command inputted as a char
     * @return                  Whether the move is valid or not
     */
    private boolean isMoveValid(char moveAttempt){

        switch (moveAttempt){
            case 'w':
                return playerRow > 0;
            case 's':
                return playerRow < rows-1;
            case 'a':
                return playerCol > 0;
            case 'd':
                return playerCol < columns-1;
            default:
                System.out.println("Unknown command, try 'W A S D'");
                return false;

        }

    }

    /**
     *  Moves the player
     * @param moveAttempt   The command input by the player
     */
    void move(char moveAttempt){
        if (isMoveValid(moveAttempt)){
            /* Marks previous position with an 'x' */
            mazeArray[playerRow][playerCol] = 'x';
            /* Moving player with a switch */
            switch (moveAttempt){
                case 'w':
                    playerRow -= 1;
                    break;
                case 's':
                    playerRow += 1;
                    break;
                case 'a':
                    playerCol -= 1;
                    break;
                case 'd':
                    playerCol += 1;
                    break;
            }
            /* Updates current player position to an 'o' */
            mazeArray[playerRow][playerCol] = 'o';
        }
    }

    /**
     * Print function to display the current state of the "maze"
     */
    void print(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(mazeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}


