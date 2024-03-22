package solarsystem;
import javafx.scene.paint.Color;
/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * This class is the implementation of Star
 */
public class Star extends CelestialBody
{
    private int surfaceTemp;

    /**
     *
     * @param name name of the Star
     * @param surfaceTemp Star's surface temperature
     */
    public Star(String name, int surfaceTemp, Color color, double radius)
    {
        super(name, "Star", color, radius);
        this.surfaceTemp = surfaceTemp;
    }

    /**
     *
     * @return Surfacetemp of the star
     */
    public int getSurfaceTemp()
    {
        return surfaceTemp;
    }
}
