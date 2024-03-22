package solarsystem;

import exceptions.DuplicateCelestialBodyException;
import java.util.ArrayList;

import java.util.List;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 02/22/2024
 * This class is the implementation of CelestialBody
 */

public class CelestialBody
{
    private String name;
    private String type;
    List<CelestialBody> children = new ArrayList<>();

    public CelestialBody(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    /**
     *
     * @return Name of the celestialbody
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return Type of the celestialbody
     */
    public String getType()
    {
        return type;
    }

    /**
     * Adds a celestialbody child
     * @param celestialBody the celestialbody that is going to be added
     * @throws DuplicateCelestialBodyException
     */
    public void add(CelestialBody celestialBody) throws DuplicateCelestialBodyException
    {
        for (CelestialBody child : getChildren())
        {
            if (child.getName().equalsIgnoreCase(celestialBody.getName()))
                throw new DuplicateCelestialBodyException(celestialBody);
        }
        getChildren().add(celestialBody);
        System.out.println("The " + celestialBody.getType() + " " + celestialBody.getName() + " " + "was added succesfully to " + getName());
    }

    /**
     *
     * @return returns a list of celestial bodies
     */
    public List<CelestialBody> getChildren()
    {
        return children;
    }
}
