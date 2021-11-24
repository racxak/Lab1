package pl.projekt;


import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOfPeople {
    private LinkedList<Person> listOfPeople = new LinkedList<>();            //Utworzenie LinkedListy

    public void addToLinkedList(Person person) {                                          //Dodawanie osób do listy

        listOfPeople.add(person);
    }

    public void showList() {                                                //Wyświetlanie danych osób z listy
        for (Person p : listOfPeople)
        {
            p.printPersonalData();
        }
    }
}
