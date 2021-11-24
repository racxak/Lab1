package pl.projekt;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthYear(birthYear);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void printPersonalData(){                                                                //wypisuje dane osoby
        System.out.println("Imię"+firstName);
        System.out.println("Nazwisko"+lastName);
        System.out.println("Wiek"+birthYear);
        System.out.println();
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int result = this.firstName.compareTo(o.firstName);
        if(result == 0)
        {
            result = this.lastName.compareTo(o.lastName);
            if (result == 0)
            {
                return this.birthYear - o.birthYear;
            }
            return result;
        }
        return result;
    }

}
