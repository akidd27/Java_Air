public class CabinCrewMember extends Person{

    private Ranks rank;

    public CabinCrewMember(String name, Ranks rank) {
        super(name);
        this.rank = rank;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public String makeAnnouncement(Flight flight){
        return "Please take a look at our range of duty free products!";
    }
}
