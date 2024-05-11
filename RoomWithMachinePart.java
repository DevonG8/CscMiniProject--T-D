/**
 * A class that represents a Room containing a machine part 
 */
public class RoomWithMachinePart extends Room{
    Part machinePart;
    private int number;

    /**
     * Contrusctor for RoomWithMachinePart
     * @param number
     * @param obj
     */
    public RoomWithMachinePart(int number, Part obj ){   
        super(number);
        this.machinePart = obj;
    }

    /**
     * getter for Machine part
     * @return Part
     */
    public Part getMachinePart(){
        return machinePart;
    }

    /**
     * 
     * @param player
     * @return Part
     */
    public Part collectPart(Player player){
        if(player.lastMachinePartCollected().equals(machinePart.getNumber())){
            return machinePart;
        }else {
            return null;
        }
    }
    
    /**
     * checks if room has machine part
     * @return boolean
     */
    @Override
    public boolean hasPart(){
        return true;
    }

    /**
     * Help message for player to indicate room number 
     * @return String 
     */
    @Override
    public String helpMessage(){
        return ("You are in room " +number);
    }
}
