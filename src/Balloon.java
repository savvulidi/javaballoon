public class Balloon {
    private double r;

    public Balloon() {
        r = 0;
    }

    public void inflate(double amount) {
        r = r + amount;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}
