import java.util.ArrayList;

public class DiningRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;
    public DiningRoom(String name, int capacity, ArrayList<Guest> guests){
        this.name = name;
        this.capacity = capacity;
        this.guests = guests;
    }

    public String getName() {
        return name;
    }
}
