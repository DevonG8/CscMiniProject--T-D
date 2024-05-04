/**
 * This class, Workshop, will extend the Room class and will be the room
 * in which the workshop exists in the game for the players to build the
 * machine. 
 * 
 * @author Antonio Cavanaugh Lillo
 * @version 1.0
 * 
 * 
 */
public class Workshop extends Room {

    //argument constructor method, room # as parameter

    public Workshop(int number) {
        //inherits room number
         super(number);
    }

    //This method is what makes this room 'contain' the workshop in game.
    //isWorkshop() method overriding isWorkshop of Room returning true
    @Override
    public boolean isWorkshop() {
        return true;
    }
    
}
