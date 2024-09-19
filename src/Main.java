import java.time.LocalDate;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {
        var person = new Person("Bartłomiej", "Ślusarz", new LocalDate(2008, 0, 1));
        System.out.println(person);
    }
}