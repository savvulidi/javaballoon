public class Main {
    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        balloon.inflate(3.5);
        balloon.inflate(1.2);
        System.out.println("Объем: " + balloon.getVolume());
    }
}