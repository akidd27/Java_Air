public enum Planes {

    BOEING_747(500, 6000),
    BOEING_737(300, 2000);

    private final int capacity;
    private final int weight;

    Planes(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }
}
