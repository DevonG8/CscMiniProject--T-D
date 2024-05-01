public class RoomWithMachinePart extends Room{
    Part machinePart;

    //contructor takes room number and obj or type part
    public RoomWithMachinePart(int number, Part obj ){   
    super(number);
    this.machinePart = obj;
    }

    //getter for machinePart

    //collectPart takes a Player as parameter; checks if last part has
    //been collected 
    
    //hasPart overrides hasPart of Room and returns true 

    //helpMessage returns a help message with room number 
}
