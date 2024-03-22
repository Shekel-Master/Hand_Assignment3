package solarsystem;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
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
    public Star(String name, int surfaceTemp)
    {
        super(name, "Star");
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
