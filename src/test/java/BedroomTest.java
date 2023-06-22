import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest;
    Bedroom bedroom;

    ArrayList<Guest> guests;

    @Before
    public void before() {
        guest = new Guest("Maz", 26);
        guests = new ArrayList<Guest>();
        guests.add(guest);
        bedroom = new Bedroom(10, guests, RoomType.PRESIDENTIAL, 69, 120);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.PRESIDENTIAL, bedroom.getRoomType());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(69, bedroom.getRoomNumber());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10, bedroom.getCapacity());
    }

    @Test
    public void canGetGuests(){
        assertEquals(guests, bedroom.getGuests());
    }
    @Test
    public void canGetNightlyRate(){
        assertEquals(120, bedroom.getNightlyRate());
    }

}
