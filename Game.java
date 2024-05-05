/**
 * This class holds the whole game and its components (the two players and 10 rooms). 
 * This class should be instantiated in the main application class 
 * @author Antonio Cavanaugh Lillo
 * @version 1.1
 * 
 */

public class Game {
	private Player[] players;
	private Room[] rooms;
	private Player currentPlayer;

	   /**
	    * Assuming that Rooms has been initialized in the constructor 
	    * to hold 10 objects of type Room or a subclass of Room, this method 
	    * sets up the doors between the rooms, as described in the map
	    * @return void
	    * @throws Exception if inconsistencies found by setDoor
	    */
	
	private void setUpDoors() throws Exception {
		rooms[0].setDoor(Direction.up, rooms[3]);
		rooms[0].setDoor(Direction.left, rooms[8]);
		
		rooms[1].setDoor(Direction.up, rooms[4]);
		rooms[1].setDoor(Direction.down, rooms[7]);
		rooms[1].setDoor(Direction.right, rooms[9]);

		rooms[2].setDoor(Direction.down, rooms[8]);

		rooms[3].setDoor(Direction.down, rooms[0]);
		rooms[3].setDoor(Direction.right, rooms[4]);

		rooms[4].setDoor(Direction.down, rooms[1]);
		rooms[4].setDoor(Direction.right, rooms[5]);
		rooms[4].setDoor(Direction.left, rooms[3]);

		rooms[5].setDoor(Direction.down, rooms[9]);
		rooms[5].setDoor(Direction.left, rooms[4]);

		rooms[6].setDoor(Direction.up, rooms[8]);
		rooms[6].setDoor(Direction.right, rooms[7]);

		rooms[7].setDoor(Direction.up, rooms[1]);
		rooms[7].setDoor(Direction.left, rooms[6]);

		rooms[8].setDoor(Direction.up, rooms[2]);
		rooms[8].setDoor(Direction.down, rooms[6]);
		rooms[8].setDoor(Direction.right, rooms[0]);

		rooms[9].setDoor(Direction.up, rooms[5]);
		rooms[9].setDoor(Direction.left, rooms[1]);

	}

	//Constructor
	//Create the players array (not the Player objects inside it)
	//
	//Create the rooms array
	//
	//Create the Room objets inside the rooms array,
	//based on their types on the map and using the constructor of the
	//subclasses you will create(d)
	//
	//Call setupDoors

	public Game(Player[] players, Room[] rooms, Player currentPlayer) {

		Room rooms[] =

		setupDoors();

	}

	//Create the two Player objects and store them in array players
	//and set the curretn room for each player ot be rooms[0]
	//
	//Set the currentPlayers to be players[0]
	public void InitGame() {

		//create two Player objects and store them in array players and assign number from class Player
		Player playerOne = new Player(1, rooms[0]);

		Player playerTwo = new Player(2, rooms[0]);

		//Assign respective players array to their respective player
		players[0] = playerOne;

		players[1] = playerTwo;

		//Set currentPlayer to be players[0] Player One
		currentPlayer = players[0];

	}

	//Getter method for getting whos turn it is
	public Player getCurrentPlayer() {

		return currentPlayer;

	}

	//Switches the current player (the players array element pointed to by currentPlayer)
	public void switchPlayer() {
		if (currentPlayer == players[1]) {
			//If it is (was) player 2s turn, it's now player 1s turn
			currentPlayer = players[0];

		} else {
			//If it was player 1s turn, now it's player 2s turn.
			currentPlayer = players[1];
		}

	}


}

