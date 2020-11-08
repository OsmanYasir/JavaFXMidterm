package sample;

public class Student {
    String FirstName;
    String LastName;
    String Group;
    int BirthYear;

    public Student(String firstName, String lastName, String group, int birthYear) {
        FirstName = firstName;
        LastName = lastName;
        Group = group;
        BirthYear = birthYear;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }
}
