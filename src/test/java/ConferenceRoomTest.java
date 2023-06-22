import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest = new Guest("Angel", 29);
        guests = new ArrayList<Guest>();
        guests.add(guest);
        conferenceRoom = new ConferenceRoom(100, guests, "Conference");
    }
    @Test
    public void canGetCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }
    @Test
    public void canGetGuests(){
        assertEquals(guests, conferenceRoom.getGuests());
    }

    @Test
    public void canGetName(){
        assertEquals("Conference", conferenceRoom.getName());
    }
}
