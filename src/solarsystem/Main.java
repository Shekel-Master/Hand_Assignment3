package solarsystem;

import exceptions.DuplicateCelestialBodyException;
import exceptions.InvalidCelestialBodyException;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import panes.SolarSystemPane;

import static panes.SolarSystemPane.scene;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * This class is the implementation of Main that connects everything together
 */

public class Main extends Application
{
        @Override
    public void start(Stage stage) throws InvalidCelestialBodyException, DuplicateCelestialBodyException
        {
            stage.setTitle("Solar System");
            //set title for stage
            solarsystem.Star sun = new solarsystem.Star("sun", 5778000, Color.YELLOW, 100);
            solarsystem.Planet mercury = new solarsystem.Planet("mercury", sun, Color.GREY, 10);
            solarsystem.Planet venus = new solarsystem.Planet("venus", sun, Color.ORANGE, 25);
            solarsystem.Planet earth = new solarsystem.Planet("earth", sun, Color.GREEN, 25);
            solarsystem.Planet mars = new solarsystem.Planet("mars", sun, Color.RED, 20);
            solarsystem.Planet jupiter = new solarsystem.Planet("jupiter", sun, Color.TAN, 45);
            solarsystem.Planet saturn = new solarsystem.Planet("saturn", sun, Color.WHEAT, 45);
            solarsystem.Planet uranus = new solarsystem.Planet("uranus", sun, Color.LIGHTBLUE, 35);
            solarsystem.Planet neptune = new solarsystem.Planet("neptune", sun, Color.DARKBLUE, 35);
            //add all the planets and stars

            SolarSystemPane.addStar(sun);
            SolarSystemPane.addPlanet(mercury, 110);
            SolarSystemPane.addPlanet(venus, 170);
            SolarSystemPane.addPlanet(earth, 240);
            SolarSystemPane.addPlanet(mars, 310);
            SolarSystemPane.addPlanet(jupiter, 380);
            SolarSystemPane.addPlanet(saturn, 450);
            SolarSystemPane.addPlanet(uranus, 520);
            SolarSystemPane.addPlanet(neptune, 590);
            //adding the planets and stars to the pane

            solarsystem.Moon moon = new solarsystem.Moon("moon", earth, Color.GREY, 8);
            solarsystem.Moon phobos = new solarsystem.Moon("phobos", mars, Color.GREY, 4);
            solarsystem.Moon deimos = new solarsystem.Moon("deimos", mars, Color.GREY, 4);
            //defining all 3 moons
            SolarSystemPane.addMoon(moon, 30);
            SolarSystemPane.addMoon(phobos, 20);
            SolarSystemPane.addMoon(deimos, 26);
            //adding all 3 moons to the pane

            scene.setFill(Color.BLACK);
            stage.setScene(scene);
            stage.show();
            //setting background to black and displaying it

    }
    public static void main(String[] args)
    {
        launch(args);
    }

}
