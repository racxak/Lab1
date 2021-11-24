package pl.projekt;

public class BetterPerson extends Person{

    public BetterPerson(String firstName, String lastName, int birthYear) {
        super(firstName, lastName, birthYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (this.getBirthYear() != person.getBirthYear()) return false;
        if (!this.getFirstName().equals(person.getFirstName())) return false;
        return this.getLastName().equals(person.getLastName());
    }

    @Override
    public int hashCode() {
        int result = this.getFirstName().hashCode();
        result = 31 * result + this.getLastName().hashCode();
        result = 31 * result + this.getBirthYear();
        return result;
    }
}
