/**
 * This class holds the whole game and its components (the two players and 10 rooms). 
 * This class should be instantiated in the main application class 
 * @author Antonio Cavanaugh Lillo
 * @version 1.2
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
	//Create the Room objects inside the rooms array,
	//based on their types on the map and using the constructor of the
	//subclasses you will create(d)
	//
	//Call setupDoors

	//This constructor will either instanitate a Workshop obj, RoomWithTools obj, 
	//a regular room, or the RoomWithMachinePart. The constructor call to RoomWithMachinePart
	//will take the room number and objPart (a Part class object) to determine which Part is present
	public Game(Player[] players, Room[] rooms, Part objPart) {

		this.players = players;
		this.rooms = rooms;

		for (int r = 0; r < rooms.length; r++) {
			switch(r) {
				case 9:
					//If room 10 then it's the room with the Workshop
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
					//otherwise the room is just a regular room with its room number //check if counter is correct.. unsure
					rooms[r] = new Room(r+1);


			}
		}
		
		try {
			setUpDoors(); //SETS DIRECTIONALITY FOR THE ROOMS IN THE GAME MAZE
		} catch(Exception e){
			System.err.println("ERROR: There seems to have been an error with setting up the doors and rooms: %s".formatted(e.getMessage()));
		}

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

