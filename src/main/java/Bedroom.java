import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;
    private int nightlyRate;

    public Bedroom(int capacity, ArrayList<Guest> guests, RoomType roomType, int roomNumber, int nightlyRate){
        super(capacity, guests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }
    public int guestCount(){
        return this.getGuests().size();
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
