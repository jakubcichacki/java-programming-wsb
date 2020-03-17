package pl.gda.wsb;

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
}
