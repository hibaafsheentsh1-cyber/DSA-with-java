 class Inheritance {
    public void eat(){
        System.out.println("Eating....");
    }
 }
class Dog extends Inheritance{
    public void bark(){
        System.out.println("Barking.....");
    }
}
class singleInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
    

