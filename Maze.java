/**
 * "This is the main class that will either:
 * 
 * - extend JavaFx Application class, builds the GUI and a set of nested classes
 * to handle the ActionEvent of each the buttons the player can click 
 * OR
 * - Read player text commands then interpret them
 * 
 * Either way, this class will instaniate the Game class, call the different
 * methods in the currentPlayer object (currrentPlayer is part of Game) to advance the game.
 * It should also display to the player the message it is receiving from these methods"
 * 
 * 
 */

//Going to need javafx import references and dependencies


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
import javafx.scene.control.TextField;


public class Maze extends Application {

    private Game game;
    private GridPane gridPane;
    pr

    private Button upButton;
    private Button leftButton;
    private Button rightButton;
    private Button downButton;
    private Button collectPart;
    private Button collectTools;
    private Button buildMachine;

    private Button helpButton;
    private Button restartButton;

    private TextField textMessages;
    private TextField textInput;

    
    public void start(Stage applicationStage) throws Exception {


        Scene scene = new Scene();
        applicationStage.setScene(scene);
        applicationStage.setTitle("Maze");
        applicationStage.show();
    }
    


//Needs a GUI builder



//Maybe error handling?



    //launch the game
    public static void main(String[] args) {
        launch(args);
    }
}
