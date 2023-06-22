import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    ArrayList<Bedroom> bedrooms;
    Bedroom bedroom;
    ArrayList<ConferenceRoom> conferenceRooms;
    ConferenceRoom conferenceRoom;
    Guest guest;
    ArrayList<Guest> guests;

    Hotel hotel;

    Booking booking;
    DiningRoom diningRoom;
    HashMap<String, DiningRoom> diningRooms;

    @Before
    public void before(){
        guest = new Guest("Michael", 32);
        guests = new ArrayList<Guest>();
        guests.add(guest);
        bedroom = new Bedroom(4, guests, RoomType.DOUBLE, 420, 120);
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom);
        conferenceRoom = new ConferenceRoom(50, guests, "Lounge");
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
        booking = new Booking(bedroom, 4);
        diningRoom = new DiningRoom("Chinese", 25, guests);
        diningRooms = new HashMap<>();
        diningRooms.put(diningRoom.getName(), diningRoom);
    }
    @Test
    public void hasBedrooms(){
        assertEquals(bedrooms, hotel.getBedrooms());
    }
    @Test
    public void hasConferenceRooms(){
        assertEquals(conferenceRooms, hotel.getConferenceRooms());
    }
    @Test
    public void canAddGuests(){
        hotel.addGuest(guest, bedroom);
        assertEquals(1, bedroom.guestCount());
    }
    @Test
    public void canGetBookedRoom(){
        assertEquals(420, booking.getBedroom().getRoomNumber());
    }
    @Test
    public void canGetNumberOfNightsBooked(){
        assertEquals(4, booking.getNumberOfNightsBooked());
    }
    @Test
    public void canGetTotal(){
        assertEquals(480, booking.getTotal());
    }
    @Test
    public void canGetDiningRoomName(){
        assertEquals(diningRooms, hotel.getDiningRooms());
    }
}
