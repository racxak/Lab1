package pl.projekt;


import java.util.*;

public class TreeSetOfPeople {
    private Set<Person> collection = new TreeSet<>();                                          //Utworzenie TreeSet

    public void addToCollection(Person person) {                                             //Dodawanie osób do listy
        collection.add(person);
    }

    public void showCollection() {                                                                       //Wyświetlanie danych osób z listy
        for (Person p : collection)
        {
            p.printPersonalData();
        }
    }
}
