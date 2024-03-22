package panes;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import solarsystem.Moon;
import solarsystem.Planet;
import solarsystem.Star;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * This class is the implementation of the SolarSystemPane, which will display all the planets
 */

public class SolarSystemPane extends Pane
{
    public static Pane SolarSystem = new Pane();
    //defining the pane
    public static Scene scene = new Scene(SolarSystem, 1500, 800);
    //defining the scene
    public SolarSystemPane(){
        scene.setFill(Color.BLACK);
    }
    //setting the background as black
    public static void addStar(Star star)
    {
        Circle circle = new Circle(0, 0, star.getRadius());
        SolarSystem.getChildren().addAll(circle);
        star.setCenterX(circle.getCenterX());
        star.setCenterY(circle.getCenterY());
        circle.setFill(Color.YELLOW);
        circle.requestFocus();
    }
    //adds the star to the scene

    public static void addPlanet(Planet planet, double distance)
    {
        Circle orbit = new Circle(planet.getOrbit().getCenterX(), planet.getOrbit().getCenterY(), distance);
        SolarSystem.getChildren().add(orbit);
        orbit.setStroke(Color.WHITE);
        orbit.setFill(Color.TRANSPARENT);
        //making orbital rings

        Circle circle = new Circle(distance+planet.getOrbit().getCenterX(), distance+planet.getOrbit().getCenterY(), planet.getRadius());
        SolarSystem.getChildren().add(circle);
        planet.setCenterX(circle.getCenterX());
        planet.setCenterY(circle.getCenterY());
        circle.setFill(planet.getFill());
        //making the circles for planets

        orbit.setRadius(Math.sqrt(Math.pow(planet.getOrbit().getLayoutX() - distance, 2) + Math.pow(planet.getOrbit().getLayoutY() - distance, 2)));
        orbit.requestFocus();
        circle.requestFocus();
        orbit.setMouseTransparent(true);
        //doing the math for orbital rings

        circle.setOnMousePressed(e -> {
            planet.getOrbitInformation();
        });
        //on click event
    }
    //adds the planets to the scene

    public static void addMoon(Moon moon, double distance)
    {
        Circle orbit = new Circle(moon.getOrbit().getCenterX(), moon.getOrbit().getCenterY(), distance);
        SolarSystem.getChildren().add(orbit);
        orbit.setStroke(Color.WHITE);
        orbit.setFill(Color.TRANSPARENT);
        //creates the orbit's circle

        Circle circle = new Circle(distance+moon.getOrbit().getCenterX(), distance+moon.getOrbit().getCenterY(), moon.getRadius());
        SolarSystem.getChildren().add(circle);
        circle.setFill(moon.getFill());
        //creates moons

        orbit.setRadius(Math.sqrt(Math.pow(moon.getOrbit().getLayoutX() - distance, 2) + Math.pow(moon.getOrbit().getLayoutY() - distance, 2)));
        orbit.requestFocus();
        circle.requestFocus();
        orbit.setMouseTransparent(true);
        //does the math for orbit rings

        circle.setOnMousePressed(e -> {
            moon.getOrbitInformation();
        });
        //sets up the mouse click event
    }


}
