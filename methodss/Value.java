
public class Value {
    public static void main(String[] args){
        int num=20;
        UpdateValue(num);
        System.out.println("The original value is: "+num);
    }
    static void UpdateValue(int num){
        num=num+10;
        System.out.println("The updated value is: "+num);
    }
    
}
