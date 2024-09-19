import java.time.LocalDate;

public abstract class Person {
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDayDate() {
        return birthDayDate;
    }

    private String name;
    private String lastName;

    public void setBirthDayDate(LocalDate birthDayDate) {
        this.birthDayDate = birthDayDate;
    }

    private LocalDate birthDayDate;

    public int getAge() {
        return 7;
    }

    public String getFullName() {
        return name + " " + lastName;
    }


    public Person(String name, String lastName, LocalDate birthDayDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDayDate = birthDayDate;
    }

//    public Person(String name, String lastName) {
//        this.name = name;
//        this.lastName = lastName;
//        this.birthDayDate = new LocalDate(2000, 0, 1);
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDayDate=" + birthDayDate +
                '}';
    }
}
