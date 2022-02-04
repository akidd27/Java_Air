import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot captain;
    Pilot firstOfficer;
    CabinCrewMember purser;
    CabinCrewMember flightAttendant1;
    CabinCrewMember flightAttendant2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(Planes.BOEING_737);
        captain = new Pilot("Mikhail", Ranks.CAPTAIN, "DEF456");
        firstOfficer = new Pilot("Yuri", Ranks.FIRST_OFFICER, "GHI789");
        purser = new CabinCrewMember("Vladimir", Ranks.PURSER);
        flightAttendant1 = new CabinCrewMember("Leonid", Ranks.FLIGHT_ATTENDANT);
        flightAttendant2 = new CabinCrewMember("Georgy", Ranks.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Dmitri", 2);
        passenger2 = new Passenger("Konstantin", 1);
        passenger3 = new Passenger("Boris", 0);
        flight = new Flight(plane, captain, firstOfficer, purser, flightAttendant1, flightAttendant2, "AB1234", "GLA", "EDI", "12:00");
    }

    @Test
    public void hasCaptain(){
        assertEquals(captain, flight.getCaptain());
    }

    @Test
    public void hasFirstOfficer(){
        assertEquals(firstOfficer, flight.getFirstOfficer());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasPurser(){
        assertEquals(purser, flight.getPurser());
    }

    @Test
    public void startsWithTwoFlightAttendants(){
        assertEquals(2, flight.getNumberOfFlightAttendants());
    }

    @Test
    public void startsWithNoPassengers(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("AB1234", flight.getFlightNumber());
    }

    @Test
    public void hasDestinationAirport(){
        assertEquals("GLA", flight.getDestinationAirport());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasFlightTime(){
        assertEquals("12:00", flight.getDepartureTime());
    }

    @Test
    public void canGetAvailableSeats(){
        assertEquals(300, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void canOnlyBookPassengerIfAvailableSeat(){
        for (int i = 0; i < 305; i ++){
            flight.bookPassenger(passenger1);
        }
        assertEquals(300, flight.getNumberOfPassengers());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("This is your captain speaking...", captain.fly(flight));
    }

    @Test
    public void cabinCrewCanMakeAnnouncement(){
        assertEquals("Please take a look at our range of duty free products!", flightAttendant1.makeAnnouncement(flight));
    }
}
