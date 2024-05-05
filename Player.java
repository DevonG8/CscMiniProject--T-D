public class Player {
    private int number;
    private Room currentRoom;
    private boolean toolsCollected;
    private int lastMachinePartCollected;

    public Player(int number, Room currentRoom){
        this.number = number;
        this.currentRoom = currentRoom;
    }
}
