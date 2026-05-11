public class InvertedAlphaTri {
    public static void main(String[] args) {
        int n=26;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                int a=n-col;
                int b='A';
                int ans=a+b;
                char FinalAns=(char)ans;
                System.out.print(FinalAns+" ");
            }
            System.out.println();
        }
    }
    
}
