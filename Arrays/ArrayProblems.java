public class ArrayProblems {

    static double GetAvg(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }

        int size = arr.length;
        return sum / size;
    }

    static int[] MulBy10(int[] arr){
        int size = arr.length;
        int newArr[] = new int[size];

        for(int i=0;i<size;i++){
            int element = arr[i];
            int newElement = element * 10;
            newArr[i] = newElement;
        }
        return newArr;
    }

    static boolean FindNum(int[] arr, int num){
        int size = arr.length;
        for(int i=0; i<size; i++){
            if(arr[i] == num){
                return true;
            }
            
        }
        return false;
    }

    static int GetMaximum(int[] arr){
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    static int[]  SumOfPosiNNeg(int[] arr){
        int positiveSum = 0;
        int negativeSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                positiveSum+=arr[i];
            }
            if(arr[i]<0){
                negativeSum+=arr[i];
            }
        }
        int ans[] ={positiveSum, negativeSum};
        return ans;
    }

    static int[] Count0_1(int[] arr){
        int zeroCount=0;
        int oneCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            if(arr[i]==1){
                oneCount++;
            }
        }
        int ans[]={zeroCount,oneCount};
        return ans;
    }

    static int FirstUnsortedElem(int[] arr2){
        for(int i=0;i<arr2.length;i++){
            if(arr2[i+1]<=arr2[i]){
                return arr2[i+1];
            }
        }
        return -1;
    }

    static int[] SwapAlternateElem(int[] arr2){
        for(int i=0;i<arr2.length;i+=2){
               int temp= arr2[i];
               arr2[i]=arr2[i+1];
               arr2[i+1]=temp;
        }
        return arr2;
    }

    static void ArrayIntersection(int[] arr2, int[] arr3) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (arr2[i] == arr3[j]) {
                    System.out.print(arr2[i] + " ");
                    break;
                }
            }
        }
    }

    static void printAlternateExtreme(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            System.out.print(arr[left] + " ");
            left++;

            if (left <= right) {
                System.out.print(arr[right] + " ");
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,0,2,-3,-1,4, 7, 8};
        System.out.print("Average of array is: ");
        System.out.println(GetAvg(arr));

        int ans[] = MulBy10(arr);
        System.out.print("Each term of array when multiplied by 10 is :");
        for(int i :ans){
            System.out.print(" " + i);
        }

        System.out.println();

        System.out.print("Search for an element in an array: ");
        boolean ans2 = FindNum(arr, 8);
        System.out.println(ans2);

        System.out.println("Maximum number in array is: " + GetMaximum(arr));

        int Sum[] = SumOfPosiNNeg(arr);
        System.out.println("Positive Sum = " + Sum[0]);
        System.out.println("Negative Sum = " + Sum[1]);

        int count[]=Count0_1(arr);
        System.out.println("Zero Count= " +count[0]);
        System.out.println("One Count= "+count[1]);

        System.out.println("using another array for the below problems");
        int[] arr2={1,3,5,2,8,10};
        int unsortedElement= FirstUnsortedElem(arr2);
        System.out.println("First unsorted element in array is: "+unsortedElement);

        int[] SwapAlterElem=SwapAlternateElem(arr2);
        System.out.print("Swap alternate element inside an arr:");
        for (int ans3:SwapAlterElem){
            System.out.print(" " +ans3);
        }

        System.out.println();

        int[] arr3={2,4,6,8,9,3};
        System.out.print("Print array intersection element:");
        ArrayIntersection(arr2, arr3);      

        System.out.println();
        System.out.print("Print alternate extreme of an element: ");
        printAlternateExtreme(arr);

    }
}
