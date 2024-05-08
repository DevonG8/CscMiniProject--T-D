/**
 * This class represents a player and manages
 * a players moves and status in the game
 * @author Devon Gay
 */
public class Player {
    private int number;
    private Room currentRoom;
    private boolean toolsCollected;
    private Part lastMachinePartCollected;

    public Player(int number, Room room){
        this.number = number;
        this.currentRoom = room;
    }
    /**
     * getter method for lsatMachinePartCollected
     * @return String 
     */
    public Part lastMachinePartCollected(){
        return lastMachinePartCollected;
    }

    /**
     * getter method for currentRoom
     * @return String 
     */
    public Room currentRoom(){
        return currentRoom;
    }

    /**
     * a getter method for toolsCollected boolean
     * @return boolean
     */
    public boolean hasTools(){
        return toolsCollected;
    }

    /**
     * 
     * @param Direction
     * @return
     */
    public String move(int Direction){
        //new room
        Room newRoom = currentRoom.getDoor(Direction);

        //if new room not there print meassge else put player in new room and print message 
        if(newRoom == null){
            return ("There is no room in this direction");
        }else{  
            currentRoom = newRoom;
            return currentRoom.printMessage();
        }
    }
    // public String collectPart(){
    //     //check if possible to collect part
    //     if(currentRoom.hasPart == null){

    //     }

    //     //if can collect set boolean true adn return string

    //     //otherwise return different string 
    // }
}
