/**
 * This class represents a player and manages
 * a players moves and status in the game
 * @author Devon Gay & Antonio Cavanaugh Lillo
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
     * Takes a direction and lets person enter new room if there is one in
     * the inputted direction
     * @param Direction
     * @return
     */
    public String move(int Direction){
        //new room
        Room newRoom = currentRoom.getDoor(Direction);

        //if new room not there print meassge else put player in new room and print message 
        if(newRoom == null){
            return ("No door in this direction");
        }else{  
            currentRoom = newRoom;
            return currentRoom.printMessage();
        }
    }

    /**
     * Checks if it is possible to collect part from currentRoom
     * if so collects part if not prints message indicating so 
     * @return
     */
    public String collectPart(){
        Part part = null;
        if(currentRoom instanceof RoomWithMachinePart){
            part = ((RoomWithMachinePart) currentRoom).getMachinePart();
        }

        if(part == null ){  //find other 
            return "Cannot collect part";
        }else{
            lastMachinePartCollected = part;
            return "You have successfully collected part " + part.getNumber();
        }
    }

    /**
     * checks if its possible to collect tool from currentRoom then collects
     * else displays message indicating error in collection
     * @return
     */
    public String collectTools(){
        //check if it is possible to collect tooms from current room 
        if(currentRoom.hasTools() == true && !toolsCollected ){
            toolsCollected = true;
            return "You have succesfully collected tools";
        }else if(currentRoom.hasTools() == true && toolsCollected == true){
            return "Tools already collected";            
        }else{
            return "Room does not have tools";
        }
    }

    /**
     * checks if player has qualifications to win game if not 
     * prints message indicating error
     * @return
     */
    public String build(){
        if(lastMachinePartCollected != null && toolsCollected == true && currentRoom.isWorkshop()){
            return "Congratulations, you've won the game!!!!";
        }else if(lastMachinePartCollected != null && toolsCollected == true && !currentRoom.isWorkshop()){
            return "You are not in the workshop";
        }else{
            return "you do not have all the parts needd to build machine";
        }
    }
    
}
