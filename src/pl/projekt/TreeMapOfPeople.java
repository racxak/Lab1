package pl.projekt;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOfPeople {
    private Map<Integer, Person> mapOfPeople = new TreeMap<>();                                 //Utworzenie LinkedListy
    private int counter = 1;


    public void addToMap(Person person) {                                                                    //Dodawanie osób do listy
        mapOfPeople.put(counter, person);
        counter++;
    }

    public void showMap() {                                                                         //Wyświetlanie
        mapOfPeople.forEach((counter,person) -> System.out.println(counter + " - " + person.getFirstName()));
    }

}
