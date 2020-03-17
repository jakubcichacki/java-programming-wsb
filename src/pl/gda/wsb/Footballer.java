package pl.gda.wsb;

public class Footballer extends Person{
    private String club;
    private String position;
    private int numberOfGoals = 0;

    public Footballer(String name, String surname, String dateOfBirth, String club, String position, int numberOfGoals) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
        this.numberOfGoals = numberOfGoals;
    }

    void scoreAGoal(String club, String surname, int numberOfGoals) {
        numberOfGoals++;
        System.out.println(club + "(" + surname + ")" + "scores!");
    }

    @Override
    public String toString() {
        return super.toString().concat("\nFootballers's club: " + club +  ", position " + position
                                       + "\nNumber of goals: " + numberOfGoals + ".");

    }
}
