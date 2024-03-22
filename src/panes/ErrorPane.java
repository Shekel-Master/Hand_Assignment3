package panes;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

/**
 * @author Dylan Hand
 * Student ID: 7745
 * date: 03/22/2024
 * This class is the implementation of the error pane
 */

public class ErrorPane extends VBox
{
    ErrorPane(String errorMessage)
    {
        TilePane r = new TilePane();
        Button button = new Button("OK");
        Label label = new Label("This is already in a collection");
        button.setOnAction((ActionEvent event)-> {
            Platform.exit();
        });
        r.getChildren().add(button);
        r.getChildren().add(label);
    }
    //this makes a button with a label and adds it to pane. When button is pressed, exits pane

}
