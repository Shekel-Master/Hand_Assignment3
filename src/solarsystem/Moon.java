package solarsystem;

import exceptions.InvalidCelestialBodyException;

import javafx.scene.paint.Color;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * This class is the implementation of Moon
 */
public class Moon extends CelestialBody implements IOrbit
{
    private CelestialBody orbits;

    /**
     *
     * @param name Name of moon
     * @param orbits The moon's orbit
     * @throws InvalidCelestialBodyException
     */
    public Moon(String name, CelestialBody orbits, Color color, double radius) throws InvalidCelestialBodyException
    {
        super(name, "moon", color, radius);
        if (orbits instanceof solarsystem.Planet)
            this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException("A moon must orbit a planet");
    }

    @Override
    public CelestialBody getOrbit()
    {
        return orbits;
    }
    //returns the orbits variable

    @Override
    public void getOrbitInformation()
    {
        System.out.println( getName() + " Orbits the planet " + orbits.getName());
    }
    //returns information about what planet it is orbiting
}
