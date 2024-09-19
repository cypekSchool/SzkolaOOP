import java.time.LocalDate;

public sealed class Teacher extends Person implements Monitor permits Educator {
    public Teacher(String name, String lastName, LocalDate birthDayDate) {
        super(name, lastName, birthDayDate);
    }


    @Override
    public void doYourDuty() {

    }
}
