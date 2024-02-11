
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed Mostafa
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public void add(Person p) {
        persons.add(p);

    }

    public ArrayList<Person> getPersons() {
        return persons;

    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person person = persons.get(0);
        for (Person p : persons) {
            if (p.getHeight() < person.getHeight()) {
                person = p;
            }
        }
        return person;
    }

    public Person take() {
        Person shortest = shortest();
        if (isEmpty()) {
            return null;
        }
        persons.remove(shortest);
        return shortest;
    }

}
