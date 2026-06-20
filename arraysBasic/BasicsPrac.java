package arraysBasic;

public class BasicsPrac {
    public static void main(String[] args) {
        //sum
        int arr[][]={{1,2,3},{11,22,33}};
        int sum=0;
        for (int[] row : arr) {
            for (int j = 0; j < row.length; j++) {
                int value = row[j];
                sum = sum + value;
            }
        }
        System.out.print("Sum is: "+ sum);
        System.out.println();

        //Multiplication
        int mul=1;
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                int multi = arr1[j];
                mul=mul*multi;
            }
        }
        System.out.print("Multiplication is: "+mul);
        System.out.println();

        //Maximum value
        int maxValue=arr[0][0];
            for (int[] row : arr) {
                for (int value : row) {
                    if (value > maxValue) {
                        maxValue = value;
                    }
                }
            }
            System.out.println("Maximum value is: "+maxValue);

            //Maximum value
        int minValue=arr[0][0];
            for (int[] row : arr) {
                for (int value : row) {
                    if (value < minValue) {
                        minValue = value;
                    }
                }
            }
            System.out.println("Minimum value is: "+minValue);

        }
    }
