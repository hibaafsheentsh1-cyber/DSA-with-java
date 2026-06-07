package Transport;

public class Car extends Vehicle {
    public int  noOfDoors;
    public String TransmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String TransmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors=noOfDoors;
        this.TransmissionType=TransmissionType;

    }

    public void startAc(){
        System.out.println("AC started of "+ name);
    }
    

}
