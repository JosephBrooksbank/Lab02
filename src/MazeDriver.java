import java.util.Scanner;

public class MazeDriver {
    public static void main(String[] args) {
        String input;
        Maze maze = new Maze(10, 10, 5, 5);
        Scanner stdin = new Scanner(System.in);


        // I originally had this in the loop, but it did nothing but clutter up the display.
        System.out.println("Available commands: {w|a|s|d|q}");

        for(;;){
            maze.print();
            input = stdin.next();
            if (input.charAt(0) == 'q')
                System.exit(0);
            maze.move(input.charAt(0));


        }

    }
}
