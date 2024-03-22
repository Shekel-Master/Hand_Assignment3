package solarsystem;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * Orbit Interface
 */
public interface IOrbit
{
    //the orbit that the celestial body is revolving around
    CelestialBody getOrbit();
    //the orbits information
    void getOrbitInformation();
}
