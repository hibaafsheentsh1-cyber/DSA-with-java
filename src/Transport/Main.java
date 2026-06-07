package Transport;
public class Main {
    public static void main(String[] args) {
        Car c= new Car("Maruti", "800",4,5,"auto");
        c.StartEngine();
        c.startAc();
        c.stopEngine();

        Motorcycle m = new Motorcycle("Splendor","Xline",2,"U","Soft");
        m.StartEngine();
        m.wheelie();
        m.stopEngine();
    }
}
