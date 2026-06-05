import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        // Input/output in 2D Array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.println("provide value for row= " + i + " and column= " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}