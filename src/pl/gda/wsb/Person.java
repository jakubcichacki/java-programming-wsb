package pl.gda.wsb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private String dateOfBirth;

    public Person(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Name and surname: " + name + surname + ", date of birth: " + dateOfBirth + '.';
    }

    void howManyYears(String surname, String dateOfBirth){

        LocalDate birthday = LocalDate.parse(dateOfBirth);
        LocalDate today = LocalDate.now();

        System.out.println(surname + " is " +  Duration.between(birthday.atStartOfDay(),today.atStartOfDay()).toDays()/365 + "years old.\n");
    }
}
