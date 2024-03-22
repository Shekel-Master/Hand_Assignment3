package exceptions;

import solarsystem.CelestialBody;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
 * Exception handler for duplicate planets/stars
 */
public class DuplicateCelestialBodyException extends Exception
{
    public DuplicateCelestialBodyException(CelestialBody celestialBody)
    {
        System.out.println("The " + celestialBody.getType() + " " + celestialBody.getName() + " is already in the collection");
    }
}
