package exceptions;

import solarsystem.CelestialBody;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
 * Exception handler for invalid celestialbody to orbit
 */
public class InvalidCelestialBodyException extends Exception
{
    public <T extends CelestialBody> InvalidCelestialBodyException(T celestialBody1,T celestialBody2)
    {
        System.out.println("A " + celestialBody1.getName() + " must orbit a " + celestialBody2.getName());
    }
}
