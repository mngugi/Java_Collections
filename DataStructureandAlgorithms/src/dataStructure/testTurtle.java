import java.awt.*;
import java.util.*;

public class TurtleArray
{
    public static void main(String[] args)
    {
        World world = new World(300, 300);
        // Declare an array for 2 Turtle objects
        Turtle[] turtarray = new Turtle[2];
        // Initialize the array elements by constructing each turtle object
        turtarray[0] = new Turtle(world);
        turtarray[1] = new Turtle(world);
        // Call each turtle's methods
        turtarray[0].forward();
        turtarray[1].turnLeft();
        turtarray[1].forward();

        world.show(true);
    }
}