package Arrays;
public class BasicsPrac{
    public static void main(String[] args) {
        //sum
        int arr[][]={{1,2,3},{11,22,33}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int value=arr[i][j];
                sum=sum+value;
            }   
        }
        System.out.print("Sum is: "+ sum);
        System.out.println();

        //Multiplication
        int mul=1;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length;j++){
                int multi=arr[i][j];
                mul=mul*multi;
            }
        }
        System.out.print("Multiplication is: "+mul);
        System.out.println();

        //Maximum value
        int maxValue=arr[0][0];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j]>maxValue){
                        maxValue=arr[i][j];
                    }
                }
            }            
            System.out.println("Maximum value is: "+maxValue);

            //Maximum value
        int minValue=arr[0][0];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j]<minValue){
                        minValue=arr[i][j];
                    }
                }
            }            
            System.out.println("Minimum value is: "+minValue);

        }
    }
