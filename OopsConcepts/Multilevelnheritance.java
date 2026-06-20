class MultiLevel {
    public void eat(){
        System.out.println("Eating....");
    }
 }
class Dog extends MultiLevel{
    public void bark(){
        System.out.println("Barking.....");
    }
}
class Babydog extends Dog{
    public void weep(){
        System.out.println("Weeping ......");
    }
}
public class Multilevelnheritance{
    public static void main(String[] args) {
        Babydog b = new Babydog();
        b.bark();
        b.eat();
        b.weep();
    }
}
