
public class Even {
    public static void main(String[] args) {
        
        int number = 4;
        isEven(number);
    }
    static int isEven(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return num;
    }
}
