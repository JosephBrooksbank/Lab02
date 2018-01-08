import java.awt.*;

/**
 * @author Joseph Brooksbank
 * @version 0.1 1/8/2018
 *
 * Class to store the "world" of the maze
 */

public class Maze {
    /** The maze array itself */
    char[][] mazeArray;
    Point playerPosition;
    int playerRow;
    int playerCol;
    int rows;
    int columns;
    /**
     * The main constructor of the maze
     * @param rows     The rows of the maze
     * @param columns    The columns of the maze
     * @param startRow    The starting Row position of the player
     * @param startCol    The starting Col position of the player
     */
    public Maze(int rows, int columns, int startRow, int startCol){
        mazeArray = new char[rows][columns];
        playerPosition = new Point(startRow, startCol);
        playerRow = startRow;
        playerCol = startCol;
        this.rows = rows;
        this.columns = columns;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (i == startRow && j == startCol)
                    mazeArray[i][j] = 'o';
                else
                    mazeArray[i][j] = ' ';
            }
        }
    }

    boolean isMoveValid(char moveAttempt){

        switch (moveAttempt){
            case 'w':
                return playerRow > 0;
            case 's':
                return playerRow < rows;
            case 'a':
                return playerCol > 0;
            case 'd':
                return playerCol < columns;
            default:
                System.out.println("Unknown command, try 'W A S D '");
                return false;

        }

    }

    void move(char moveAttempt){
        if (isMoveValid(moveAttempt)){
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
        }
    }

    void print(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(mazeArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
