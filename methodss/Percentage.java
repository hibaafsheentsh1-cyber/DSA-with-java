
public class Percentage {
    public static void main(String[] args) {
        int percentage = CalculatePercentage(500, 450);
        System.out.println("The percentage is: " + percentage + "%");
    }
    static int CalculatePercentage(int totalMarks, int marksObtained){
        int percentage=(marksObtained*100)/totalMarks;
        return percentage;
    }
}
