import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }
    public void addGuest(Guest guest, Bedroom bedroom){
        if(bedroom.getGuests().size() == 0){
            bedroom.getGuests().add(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNightsBooked){
        return new Booking(bedroom, numberOfNightsBooked);
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }
}
