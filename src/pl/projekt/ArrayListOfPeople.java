package pl.projekt;

import java.util.List;
import java.util.ArrayList;


public class ArrayListOfPeople {

    private List<Person> listOfPeople = new ArrayList<>();                        //Utworzenie ArrayListy

    public void addToArrayList(Person person) {                                  //Dodawanie osób do listy
        listOfPeople.add(person);
    }

    public void showList() {                                                      //Wyświetlanie danych osób z listy
        for (Person p : listOfPeople)
        {
            p.printPersonalData();
        }
    }



}
