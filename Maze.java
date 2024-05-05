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
 * @author Antonio Cavanaugh Lillo
 * @version 1.1
 * 
 */
public class Maze extends Application {

    //Organized Maze class member variable declarations
    private Game game;
    private GridPane gridPane;
    

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
    private TextField textOutput;

    
    public void start(Stage applicationStage) throws Exception {

        //Declaration of 
        Scene scene = null;
        GridPane gridPane = null;

        gridPane = new GridPane();
        scene = new Scene(gridPane, 600, 600);

        //Instantiates rooms (10 rooms) and two players of respect class
        Room[] rooms = new Room[10];
        Player[] players = new Player[2];



        applicationStage.setScene(scene);   //Set the games window scene

        applicationStage.setTitle("Maze");  //Set the games window title

        applicationStage.show();            //Display the game GUI
    }
    


    //Needs a GUI builder



    //Maybe error handling?



    //launch the game
    public static void main(String[] args) {

        launch(args); //lauches the maze game application
    }
}
