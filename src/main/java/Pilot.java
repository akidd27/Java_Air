public class Pilot extends CabinCrewMember{

    private String pilotLicenseNumber;

    public Pilot(String name, Ranks rank, String pilotLicenseNumber) {
        super(name, rank);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(String pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String fly(Flight flight){
        return "This is your captain speaking...";
    }
}
