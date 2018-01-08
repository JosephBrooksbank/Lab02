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
    /**
     * The main constructor of the maze
     * @param width     The width of the maze
     * @param height    The height of the maze
     * @param startRow    The starting Row position of the player
     * @param startCol    The starting Col position of the player
     */
    public Maze(int width, int height, int startRow, int startCol){
        mazeArray = new char[width][height];
        playerPosition = new Point(startRow, startCol);
        playerRow = startRow;
        playerCol = startCol;

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
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
                if (playerRow > 0)
                    return true;
                break;

            case 's':

                }


    }


}
