import java.time.LocalDate;

public class Student extends Person implements Monitor {
    private int nrEwidencyjny;
    private static int amountOfStudents = 0;

    public Student(String name, String lastName, LocalDate birthDayDate) {
        super(name, lastName, birthDayDate);
        nrEwidencyjny = amountOfStudents++;
    }

    @Override
    public void doYourDuty() {
        System.out.println("spectate");
    }
}
