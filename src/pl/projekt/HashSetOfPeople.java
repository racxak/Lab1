package pl.projekt;
import java.util.HashSet;
import java.util.Set;


public class HashSetOfPeople {
    private Set<Person> collection = new HashSet<>();          //Utworzenie HashSet

    public void addToCollection(Person person) {               //Dodawanie osób do HashSet

        collection.add(person);
    }

    public void showCollection() {                            //Wyświetlanie danych osób z HashSet
        for (Person p : collection)
        {
            p.printPersonalData();
        }
    }

    public void checkingEqualsAndHashCode(){

        Set<Person> peopleWithoutEqualAndHashcode = new HashSet<>();
        Person person1 = new Person("Kasia","Kowalska",2000);
        Person person2 = new Person("Kasia","Kowalska",2000);
        Person person3 = new Person("Paweł","Nowak",2001);
        peopleWithoutEqualAndHashcode.add(person1);                                        //add person1 i person2 pokazuje czy HashSet pozwala na dodanie dwóch takich samych elementów bez nadpisywania metody
        peopleWithoutEqualAndHashcode.add(person2);
        peopleWithoutEqualAndHashcode.add(person3);
        peopleWithoutEqualAndHashcode.add(person3);
        System.out.println();
        System.out.println("Set obiektow ktore nie maja nadpisanej metody equals i hashcode");
        System.out.println();
        for (Person person : peopleWithoutEqualAndHashcode) {
            System.out.println(person);
        }

        Set<Person> peopleWithEqualAndHashCode = new HashSet<>();
        Person betterPerson1 = new BetterPerson("Kasia","Kowalska",2000);
        Person betterPerson2 = new BetterPerson("Kasia","Kowalska",2000);
        Person betterPerson3 = new BetterPerson("Piotr","Nowak",2001);
        peopleWithEqualAndHashCode.add(betterPerson1);                                                                   //add peroson1 i person2 sprawdza czy dodają się takie same elementy
        peopleWithEqualAndHashCode.add(betterPerson2);                                                                   //add person3 soprawdza czy można dodać ten sam element
        peopleWithEqualAndHashCode.add(betterPerson3);
        peopleWithEqualAndHashCode.add(betterPerson3);

        System.out.println("Set obiektow ktore  maja nadpisana metode equals i hashcode");
        for (Person person : peopleWithEqualAndHashCode) {
            System.out.println(person);
        }
    }

}

