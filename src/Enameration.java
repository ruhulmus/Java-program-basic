import java.util.Vector;
import java.util.Enumeration;

public class Enameration {
    public static void main(String[] args) {
        Enumeration days;
        Vector dayNames = new Vector();

        dayNames.add("Friday");
        dayNames.add("Saturday");
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");

        days = dayNames.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
