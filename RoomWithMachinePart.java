public class RoomWithMachinePart extends Room{
    Part machinePart;
    private int number;

    //contructor takes room number and obj or type part
    public RoomWithMachinePart(int number, Part obj ){   
    super(number);
    this.machinePart = obj;
    }

    //getter for machinePart
    public Part getMachinePart(){
        return machinePart;
    }

    //collectPart takes a Player as parameter
    public Part collectPart(Player player){
        /*checks if the last Part
        collected by the player sent as an argument is the one right before the it has. If so, it
        returns the one it has (machinePart); otherwise, it returns null; */

    }
    
    //hasPart overrides hasPart of Room and returns true 
    @Override
    public boolean hasPart(){
        return true;
    }

    //helpMessage returns a help message with room number 
    @Override
    public String helpMessage(){
        return ("You are in room " +number);
    }
}
