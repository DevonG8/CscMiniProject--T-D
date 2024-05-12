/**
 * This class, Workshop, will extend the Room class and will be the room
 * in which the workshop exists in the game for the players to build the
 * machine. 
 * 
 * @author Antonio Cavanaugh Lillo & Devon Gay
 * @version 1.2
 * 
 * 
 */
public class Workshop extends Room {

    /**
     * This method is the argument constructor and will take the room
     * number from the superclass Room as it's parameter. 
     * @param number
     * 
     */
    public Workshop(int number) {
        //inherits room number
         super(number);
    }

   
    /**
     * Overrides isWorkshop() of class Room. 
     * Determines whether this is the room with the workshop or not
     * 
     * @return true
     * 
     */
    @Override
    public boolean isWorkshop() {
        return true;
    }
    
}
