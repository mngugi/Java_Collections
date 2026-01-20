import java.awt.*;
import java.util.*;

public class TurtleArray
{
    public static void main(String[] args)
    {
        World world = new World(300, 300);
        // Declare an array for 2 Turtle objects
        Turtle[] turtarray = new Turtle[4];
        // Initialize the array elements by constructing each turtle object
        turtarray[0] = new Turtle(world);
        turtarray[1] = new Turtle(world);
        turtarray[2] = new Turtle(world);
        turtarray[3] = new Turtle(world);
        // Call each turtle's methods
        turtarray[0].forward();
        turtarray[1].turnLeft();
        turtarray[1].forward();
        turtarray[2].turnRight();
        turtarray[2].forward();
        turtarray[3].forward();
        turtarray[3].backward();

        world.show(true);
    }
}
