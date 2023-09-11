public class Car  {
    private Motor motor;
    private Transmission transmission;
    private Wheel wheel;
    private Carbody carbody;
    private String name;
    private int price;
    private int Scoring;



    public Car(){
        super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getScoring() {
        return Scoring;
    }

    public void setScoring(int scoring) {
        Scoring = scoring;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Carbody getCarbody() {
        return carbody;
    }

    public void setCarbody(Carbody carbody) {
        this.carbody = carbody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Scoring=" + Scoring +
                '}';
    }
}
