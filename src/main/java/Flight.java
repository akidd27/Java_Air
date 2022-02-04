import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private Pilot captain;
    private Pilot firstOfficer;
    private CabinCrewMember purser;
    private ArrayList<CabinCrewMember> flightAttendants;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, Pilot captain, Pilot firstOfficer, CabinCrewMember purser, CabinCrewMember flightAttendant1, CabinCrewMember flightAttendant2, String flightNumber, String destinationAirport, String departureAirport, String departureTime) {
        this.plane = plane;
        this.captain = captain;
        this.firstOfficer = firstOfficer;
        this.purser = purser;
        this.flightAttendants = new ArrayList<>();
        this.flightAttendants.add(flightAttendant1);
        this.flightAttendants.add(flightAttendant2);
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Pilot getCaptain() {
        return captain;
    }

    public void setCaptain(Pilot captain) {
        this.captain = captain;
    }

    public Pilot getFirstOfficer() {
        return firstOfficer;
    }

    public void setFirstOfficer(Pilot firstOfficer) {
        this.firstOfficer = firstOfficer;
    }

    public CabinCrewMember getPurser() {
        return purser;
    }

    public void setPurser(CabinCrewMember purser) {
        this.purser = purser;
    }

    public ArrayList<CabinCrewMember> getFlightAttendants() {
        return flightAttendants;
    }

    public void setFlightAttendants(ArrayList<CabinCrewMember> flightAttendants) {
        this.flightAttendants = flightAttendants;
    }

    public int getNumberOfFlightAttendants(){
        return this.flightAttendants.size();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengers.remove(passenger);
    }

    public void clearPassengers(){
        this.passengers.clear();
    }

    public int getAvailableSeats() {
        return this.plane.getCapacity() - this.getNumberOfPassengers();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.getAvailableSeats() > 0) {
            this.addPassenger(passenger);
        }
    }
}
