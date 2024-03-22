package solarsystem;

import exceptions.InvalidCelestialBodyException;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
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
    public Moon(String name, CelestialBody orbits) throws InvalidCelestialBodyException
    {
        super(name, "moon");
        if (orbits instanceof solarsystem.Planet)
            this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException(this, orbits);
    }

    @Override
    public void getOrbit()
    {
        System.out.println(getName() + " is orbiting the Planet " + orbits.getName());
    }
}
