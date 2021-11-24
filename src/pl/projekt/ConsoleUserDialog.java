package pl.projekt;

import java.util.HashSet;
import java.util.Scanner;

public class ConsoleUserDialog {

    ArrayListOfPeople arrayListOfPeople = new ArrayListOfPeople();
    LinkedListOfPeople linkedListOfPeople = new LinkedListOfPeople();
    HashSetOfPeople hashSetOfPeople = new HashSetOfPeople();
    TreeSetOfPeople treeSetOfPeople = new TreeSetOfPeople();
    HashMapOfPeople hashMapOfPeople = new HashMapOfPeople();
    TreeMapOfPeople treeMapOfPeople = new TreeMapOfPeople();

    public void runMainLoop() {

        /*
            By program zrealizował i pokazał działanie kolekcji List, Set i Map zgodnie z założeniami zadania
            należy podać tak dane osoby by

         */

        while (true) {
            System.out.println("----MENU GŁÓWNE-----");
            System.out.println("1. Dodaj osobę do kolekcji");       //dla ułatwienia pokazania jak dzialają określone kolekcje osoba ta doda się do wszystkich list
            System.out.println("2. Wyświetl ArrayListę");
            System.out.println("3. Wyświrtl LinkedListę");
            System.out.println("4. Wyświetl HashSet");
            System.out.println("5. Wyświetl TreeSet");
            System.out.println("6. Wyświetl HashMapę");
            System.out.println("7. Wyświetl TreeMapę");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println();


            switch (choice) {
                case 1: {
                    System.out.println("Dodaj osobe");
                    Person person = getPerson();
                    arrayListOfPeople.addToArrayList(person);
                    linkedListOfPeople.addToLinkedList(person);
                    hashSetOfPeople.addToCollection(person);
                    treeSetOfPeople.addToCollection(person);
                    hashMapOfPeople.addToMap(person);
                    treeMapOfPeople.addToMap(person);
                    break;
                }
                case 2: {
                    arrayListOfPeople.showList();
                    break;
                }
                case 3: {
                    linkedListOfPeople.showList();
                    break;
                }
                case 4: {
                    hashSetOfPeople.showCollection();
                    break;
                }
                case 5: {
                    treeSetOfPeople.showCollection();
                    break;
                }
                case 6: {
                    hashMapOfPeople.showMap();
                    break;
                }
                case 7: {
                    treeMapOfPeople.showMap();
                    break;
                }

            }

        }
    }

    private static Person getPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię osoby:");
        String firstName = scanner.nextLine();

        System.out.println("Podaj nazwisko osoby:");
        String lastName = scanner.nextLine();

        System.out.println("Podaj rok urodzenia osoby:");
        int birthYear = scanner.nextInt();
        return new Person(firstName, lastName, birthYear);
    }

    public void checkHowEqualsHashCodeWork(){
        hashSetOfPeople.checkingEqualsAndHashCode();
    }
}
