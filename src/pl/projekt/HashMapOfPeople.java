package pl.projekt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapOfPeople {
    private Map<Integer, Person> mapOfPeople = new HashMap<>();                                 //Utworzenie HashMapy

    private int counter = 1;


    public void addToMap(Person person) {                                                        //Dodawanie osób do HashMapy

        mapOfPeople.put(counter, person);
        counter++;
    }

    public void showMap() {                                                                         //Wyświetlanie HashMapy
        mapOfPeople.forEach((counter,person) -> System.out.println(counter + " - " + person.getFirstName()));
    }

}
