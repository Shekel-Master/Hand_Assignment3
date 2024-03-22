package exceptions;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
 * Exception handler for invalid celestialbody to orbit
 */
public class InvalidCelestialBodyException extends Exception
{
    public InvalidCelestialBodyException (String argMessage)
    {
        super(argMessage);
    }
}
