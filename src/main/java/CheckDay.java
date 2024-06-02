import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class CheckDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        int day = scanner.nextInt();  //The suer enteryy enterd here

        if (day >= 1 && day <= 5) {
            System.out.print("WorkDay ");


        } else if (day == 6 || day == 7) {
            System.out.print("Weekendy ");
        } else {
            System.out.print("Invalid ");
        }
    }
}
