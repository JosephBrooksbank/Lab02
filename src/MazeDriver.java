import java.util.Scanner;

public class MazeDriver {
    public static void main(String[] args) {
        String input;
        Maze maze = new Maze(10, 10, 5, 5);
        Scanner stdin = new Scanner(System.in);


        for(;;){
            maze.print();
            System.out.println("What is your command? {w|a|s|d|q}");
            input = stdin.next();
            maze.move(input.charAt(0));


        }

    }
}
