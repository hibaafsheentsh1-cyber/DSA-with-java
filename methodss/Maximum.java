
public class Maximum {
    public static void main(String[] args){
        int max=GetMaximum(50,8);
        System.out.println("The maximum number is: "+max);
    }
    static int GetMaximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
