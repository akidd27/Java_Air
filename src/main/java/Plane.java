public class Plane {

    private Planes planeType;

    public Plane(Planes planeType) {
        this.planeType = planeType;
    }

    public Planes getPlaneType() {
        return planeType;
    }

    public void setPlaneType(Planes planeType) {
        this.planeType = planeType;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }

    public int getWeight(){
        return this.planeType.getWeight();
    }
}
