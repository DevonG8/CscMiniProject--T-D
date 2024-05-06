public class Player {
    private int number;
    private Room currentRoom;
    private boolean toolsCollected;
    private Part lastMachinePartCollected;

    public Player(int number, Room room){
        this.number = number;
        this.currentRoom = room;
    }
    public Part lastMachinePartCollected(){
        return lastMachinePartCollected;
    }
    public Room currentRoom(){
        return currentRoom;
    }

    public boolean hasTools(){
        return toolsCollected;
    }

    public String move(int Direction){
        //create new direction object
        Room nnewRoom = currentRoom.getDoor(Direction);
        //takes directions


        //If there is a door change currentRoom 
        //accordingly and returns string

        //otherwise, it returns "no door in this direction"
    }
    public String collectPart(){
        //check if possible to collect part

        //if can collect set boolean true adn return string

        //otherwise return different string 
    }
}
