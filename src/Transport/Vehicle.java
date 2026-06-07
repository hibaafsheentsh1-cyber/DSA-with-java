package Transport;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;


    // Setting up default constructor
    public Vehicle() {
        this.name="";
        this.model="";
        this.noOfTyres=-1;
    }

    public Vehicle(String name, String model, int noOfTyres) {
        this.name=name;
        this.model=model;
        this.noOfTyres=noOfTyres;
    }

    void StartEngine(){
        System.out.printf("Engine is Starting of %s : %s\n ", name , model);
    }
    void stopEngine(){
        System.out.printf("Engine is Stopping of %s : %s\n ", name , model);
    }

    
}
