
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed
 */
public class Employees {

    private ArrayList<Person> empolyees;

    public void add(Person personToAdd) {
        empolyees.add(personToAdd);
    }

    public Employees() {
        empolyees = new ArrayList<>();
    }

    public void add(List<Person> peopleToAdd) {
        this.empolyees.addAll(peopleToAdd);
    }

    public void print() {
        //empolyees.forEach(empolyee->System.out.println(empolyee));

        Iterator<Person> p = empolyees.iterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }

    }

    public void print(Education education) {
//        empolyees.stream()
//                .filter((Person t) ->{
//                    return t.getEducation()==education;
//                }).forEach(a->System.out.println(a));

        Iterator<Person> p = empolyees.iterator();
        while (p.hasNext()) {
            Person per = p.next();
            if (per.getEducation() == education) {
                System.out.println(per);
            }
        }

    }

    public void fire(Education education) {
        Iterator<Person> p = empolyees.iterator();
        while (p.hasNext()) {
            if (p.next().getEducation() == education) {
                p.remove();
            }
        }

    }

}
