/**
 * This subclass will extend the superclass Room, and will be where
 * the tools are stored in the game map for players to retrieve and build
 * the machine.
 * 
 * It will contain no additional data members
 * 
 * @author Antonio Cavanaugh Lillo & Devon Gay
 * @version 1.2
 *
 */

public class RoomWithTools extends Room {

    /**
     * This method is the argument constructor and will take the room
     * number from the superclass Room as it's parameter. 
     * @param number
     * 
     */
    public RoomWithTools(int number) {

        super(number);

    }

    /**
     * Overrides hasTools() of class Room
     * Determines whether the room has tools or not in game.
     * 
     * @return true
     * 
     */
    @Override
    public boolean hasTools() {
        
        return true; 

    }

}