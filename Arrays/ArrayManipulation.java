public class ArrayManipulation{
    //reverse an array
    static void ReverseArray(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k: arr){
            System.out.print(k+ " ");
        }
    }

    static void ShiftBy1(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.print("Reverse of the array is: ");
        ReverseArray(arr);
        System.out.println();

        System.out.print("Shift position by one: ");
        ShiftBy1(arr);
        for(int k:arr){
            System.out.print(k+ " ");
        }
        System.out.println();

        
    }
}