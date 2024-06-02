import java.util.Scanner;

public class CllMethod {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Enter your mark");
        double Mark = sc.nextDouble();
        double fullMark = sc.nextDouble();

        double YourMark = MethodMarks.CalcuMarks(Mark,fullMark);
        String grade = MethodMarks.getFullMark(YourMark);

        System.out.println(YourMark);
        System.out.println(grade);
    }
}
