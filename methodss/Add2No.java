public class Add2No {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = addTwoNumbers(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
