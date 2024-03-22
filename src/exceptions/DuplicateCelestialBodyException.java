package exceptions;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
 * Exception handler for duplicate planets/stars
 */
public class DuplicateCelestialBodyException extends Exception
{
    public DuplicateCelestialBodyException (String argMessage)
    {
        super(argMessage);
    }
}
