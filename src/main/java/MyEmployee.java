import javax.swing.plaf.PanelUI;
import java.util.Date;
import java.util.Locale;

public class MyEmployee {
    String name;
    double salary;
    int hiherYear;

    public MyEmployee(String n, double s, int h) {
        name = n;
        salary = s;
        hiherYear = h;
    }

    public double calculateS() {
        return salary * 12;
    }

    public int calculateY() {
        return (2024 - hiherYear);

    }

}
