//JavaFx imports and references for GUI

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * This is the Maze class, which will extend the Application class. 
 * The Maze class will build the GUI of the game and create a set
 * of nested classes to handle the players action events (buttons).
 * 
 * This class will instaniate the Game class and handle switching
 * which player's turn it currently is by calling the method currentPlayer...
 * as well as displaying the respective messages in correlation to chosen action.
 * 
 * @author Antonio Cavanaugh Lillo & Devon Gay
 * @version 1.1
 * 
 */
public class Maze extends Application {

    @Override
    public void start(Stage primaryStage) {
        Game game; 

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label player1Label = new Label("Player 1");
        Label player2Label = new Label("Player 2");

        Button player1UpButton = new Button("Up");
        Button player1DownButton = new Button("Down");
        Button player1LeftButton = new Button("Left");
        Button player1RightButton = new Button("Right");

        Button player2UpButton = new Button("Up");
        Button player2DownButton = new Button("Down");
        Button player2LeftButton = new Button("Left");
        Button player2RightButton = new Button("Right");

        Button collectToolsButton = new Button("Collect Tools");
        Button collectPartButton = new Button("Collect Part");
        Button buildButton = new Button("Build");

        TextArea outputTextArea = new TextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setWrapText(true);
        outputTextArea.setPrefRowCount(3);

        Button helpButton = new Button("Help");

        gridPane.add(player1Label, 0, 0);
        gridPane.add(player2Label, 7, 0);
        gridPane.add(player1UpButton, 0, 1);
        gridPane.add(player1DownButton, 0, 2);
        gridPane.add(player1LeftButton, 0, 3);
        gridPane.add(player1RightButton, 0, 4);
        gridPane.add(player2UpButton, 7, 1);
        gridPane.add(player2DownButton, 7, 2);
        gridPane.add(player2LeftButton, 7, 3);
        gridPane.add(player2RightButton, 7, 4);
        gridPane.add(collectToolsButton, 2, 6);
        gridPane.add(collectPartButton, 3, 6);
        gridPane.add(buildButton, 4, 6);
        gridPane.add(outputTextArea, 0, 7, 8, 3);
        gridPane.add(helpButton, 3, 10);

        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setTitle("Grid With Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    


    //Needs a GUI builder


   
    //Maybe error handling?



    //launch the game
    public static void main(String[] args) {

        launch(args); //lauches the maze game application
    }
}
