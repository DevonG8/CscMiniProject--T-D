/**
 * This class represents a machine part that can
 * be in a RoomWithMachinePart 
 * @author Devon Gay 
 */

public class Part {

    private int number;
    private int LAST_PART = 4;

    /**
     * constructor that that takes partNumber as a parameter
     * @param partNumber
     */
    public Part(int partNumber){
        this.number = partNumber;
    }

    /**
     * getter method for number of part you have
     * @return number
     */
    public int getNumber(){
        return number;
    }

    /**
     * A boolean that will take a part number as 
     * parameter and returns true if it is the 
     * final part needed to make the machine 
     * @param number number of current part
     * @return boolean
     */
    public boolean isLastPart(int number){
        //boolean for loop 
        boolean lastPart = false;

        //if loop
        if (number == LAST_PART){
            lastPart = true;
            return lastPart;
            
        }
        return lastPart;
    }

    /**
     * takes part as parameter and returns true
     * if current part is the next part in player
     * progression false otherwise
     * @param number number of part
     * @return boolean
     */
    public boolean isNext(int number){
        boolean next = false;
        if (this.number == number +1){
            next = true;
            return next;
        }
        return next;
        }
}
