package solarsystem;

import exceptions.DuplicateCelestialBodyException;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * This class is the implementation of CelestialBody
 */

public class CelestialBody extends Circle
{
    private String name;
    private String type;
    List<CelestialBody> children = new ArrayList<>();

    public CelestialBody(String name, String type, Color color, double radius)
    {
        this.name = name;
        this.type = type;
        this.setFill(color);
        this.setRadius(radius);
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

    public void getInformation()
    {
        System.out.println("This is the " + getType() + " " + getName());
    }
    //returns a simple print out about celestial body

    /**
     * Adds a celestialbody child
     * @param celestialBody the celestialbody that is going to be added
     * @throws DuplicateCelestialBodyException
     */
    public void add(CelestialBody celestialBody) throws DuplicateCelestialBodyException
    {
        if(children.contains(celestialBody))
        {
            throw new DuplicateCelestialBodyException("The " + celestialBody + " is already in the collection");
        }
        else
        {
            children.add(celestialBody);
            System.out.println(celestialBody.getName() + " was successfully added to " + getName());
        }
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
