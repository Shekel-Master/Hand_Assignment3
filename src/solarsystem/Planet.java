package solarsystem;

import exceptions.InvalidCelestialBodyException;
import javafx.scene.paint.Color;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * This class is the implementation of Planet
 */
public class Planet extends CelestialBody implements IOrbit
{
    private CelestialBody orbits;

    /**
     *
     * @param name Name of the planet
     * @param orbits Planet's orbit
     * @throws InvalidCelestialBodyException
     */
    public Planet(String name, CelestialBody orbits, Color color, double radius) throws InvalidCelestialBodyException
    {
        super(name, "planet", color, radius);
        if (orbits instanceof solarsystem.Star)
            this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException("A planet must orbit a star");
    }

    @Override
    public CelestialBody getOrbit()
    {
        return orbits;
    }
    //returns the orbit variable

    @Override
    public void getOrbitInformation()
    {
        System.out.println(getName() + " Orbits the star " + orbits.getName());
    }
    //returns information about what it is orbiting
}
