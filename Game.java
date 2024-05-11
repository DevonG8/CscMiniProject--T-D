/**
 * The class Game holds the entirity of the game and its components (two players & 10 rooms);
 * Game class be instantiated in the main application class.
 * It will be responsible for setting up the players, the rooms, the doors (pathways to and from each room)
 * as well as switching between players for each turn and ofcourse initiating the actual game.
 * 
 * @author Antonio Cavanaugh Lillo
 * @version 2.1
 * 
 */

public class Game {

	/**
	 * The players array with hold two Player objects @see Player.java
	 */
	private Player[] players;

	/**
	 * The rooms array will hold the 10 Room objects and it's respective subclasses...
	 * @see Room.java
	 */
	private Room[] rooms;

	/**
	 * This is a pointer to whoevers (which player) turn it is, one of the two Player objects
	 * @see Player.java 
	 */
	private Player currentPlayer;

	   /**
	    * Assuming that Rooms[] has been initialized in the constructor 
	    * correctly without an error, setUpDoors() will handle the
	    * directionality of the map and determine which rooms(and its doors) lead to which rooms.
		*
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

	/**
	 * This is the Game constructor, it will create a new instance of Game with the
	 * two new instances of players, assign the rooms in the rooms array(and type of room) based on number, 
	 * and finally also setting up the doors calling the setUpDoors() method where they
	 * lead in the map if there is no error produced in setting up the doors.
	 * 
	 * 
	 * @param players
	 * @param rooms
	 * @param objPart
	 * @throws Exception #If doors are not setup properly!
	 */
	public Game(Player[] players, Room[] rooms, Part objPart) {
		/**
		 * Instantiates the players and rooms array
		 */
		this.players = players;
		this.rooms = rooms;

		/**
		 * This loop assigns the rooms which type of room class they are based on
		 * the number the room is in the rooms array.
		 */
		for (int r = 0; r < rooms.length; r++) {
			switch(r) {

				/**
				 * When index r in the length of the rooms array is 9, it is pointing to the 10th room (Workshop)
				 */
				case 9:
					rooms[r] = new Workshop(10);
					break;
				case 7:
					//If room 8 then it's the room that contains Tools
					rooms[r] = new RoomWithTools(8);
					break;
				case 3:
					//Room with part 3
					rooms[r] = new RoomWithMachinePart(2, objPart);		
					break;												
				case 5:
					//Room with part 4
					rooms[r] = new RoomWithMachinePart(6, objPart);
					break;
				case 4:
					//Room with part 2
					rooms[r] = new RoomWithMachinePart(5, objPart);
					break;
				case 2:
					//Room with part 1
					rooms[r] = new RoomWithMachinePart(3, objPart);
					break;

				default:
					
					//When it's any other room than the ones specified above, it's index r + 1 to point to actual room number
					//Example: Index r=0 is actually Room 1. Index r=1 is actually Room 2.
					rooms[r] = new Room(r+1);
			}
		}
		
		//Error handler in the event something is not set up correctly in the doors.
		try {
			//Sets the directionality of the game map, so: which door leads to which room.
			setUpDoors();

		} catch(Exception e){

			System.err.println("ERROR: There seems to have been an error with setting up the doors and rooms: %s".formatted(e.getMessage()));
		}

	}
	

	
	/*
	 * Creates the players that will play the game & desginating which player is which, 
	 * where the players begin on the map and assigns the current turn to Player 1.
	 * 
	 */
	public void InitGame() {

		
		//Creates the two Player objects with the respective player number,
		//also places the players in Room 1 to begin the game.
		 
		Player playerOne = new Player(1, rooms[0]);

		Player playerTwo = new Player(2, rooms[0]);

		//Player one is the first player in the index, player two is the second index in the players[] array.
		players[0] = playerOne;

		players[1] = playerTwo;

		//Set currentPlayer to be players[0] Player One
		currentPlayer = players[0];

	}

	/**
	 * Getter method for getting whos turn it is
	 * @return currentPlayer
	 */
	public Player getCurrentPlayer() {

		return currentPlayer;

	}

	/**
	 * Switches the current player (the players array element pointed to by currentPlayer)
	 */
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

