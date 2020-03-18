package pl.gda.wsb;

public class Footballer extends Person{
    private String club;
    private Position position;
    private int numberOfGoals = 0;

    public Footballer(String name, String surname, String dateOfBirth, String club, Position position) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
    }

    void scoreAGoal() {
        numberOfGoals++;
        System.out.println(club + "(" + getSurname() + ")" + "scores!");
    }

    @Override
    public String toString() {
        return super.toString().concat("\nFootballers's club: " + club +  ", position " + position
                                       + "\nNumber of goals: " + numberOfGoals + ".");

    }
}
