package solarsystem;

import exceptions.InvalidCelestialBodyException;
import exceptions.DuplicateCelestialBodyException;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
 * This class is the implementation of Main that connects everything together
 */

public class Main
{
    public static void main(String[] args) throws InvalidCelestialBodyException
    {
        try
        {
            solarsystem.Star sun = new solarsystem.Star("sun", 5778000);
            solarsystem.Planet mercury = new solarsystem.Planet("mercury", sun);
            solarsystem.Planet venus = new solarsystem.Planet("venus", sun);
            solarsystem.Planet earth = new solarsystem.Planet("earth", sun);
            solarsystem.Planet mars = new solarsystem.Planet("mars", sun);
            solarsystem.Planet jupiter = new solarsystem.Planet("jupiter", sun);
            solarsystem.Planet saturn = new solarsystem.Planet("saturn", sun);
            solarsystem.Planet uranus = new solarsystem.Planet("uranus", sun);
            solarsystem.Planet neptune = new solarsystem.Planet("neptune", sun);

            sun.add(mercury);
            sun.add(venus);
            sun.add(earth);
            sun.add(mars);
            sun.add(jupiter);
            sun.add(saturn);
            sun.add(uranus);
            sun.add(neptune);

            solarsystem.Moon moon = new solarsystem.Moon("moon", earth);
            earth.add(moon);

            solarsystem.Moon phobos = new solarsystem.Moon("phobos", mars);
            solarsystem.Moon deimos = new solarsystem.Moon("deimos", mars);
            mars.add(phobos);
            mars.add(deimos);
            solarsystem.Moon x = new solarsystem.Moon("x", sun);
        }

        catch (DuplicateCelestialBodyException e)
        {
            System.out.println("The celestial body already exists in the collection");
        }
    }
}
