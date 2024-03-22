package solarsystem;

import exceptions.InvalidCelestialBodyException;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
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
    public Planet(String name, CelestialBody orbits) throws InvalidCelestialBodyException
    {
        super(name, "planet");
        if (orbits instanceof solarsystem.Star)
            this.orbits = orbits;
        else
            throw new InvalidCelestialBodyException(this, orbits);
    }

    @Override
    public void getOrbit()
    {
        System.out.println(getName() + " is orbiting the Star " + orbits.getName());
    }
}
