package comparatop;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        People p1 = new People("Grisha", "Wfjc", 11);
        People p2 = new People("Gleg", "Sjfdgdg", 6);
        People p5 = new People("Gleg", "Kras", 5);
        People p4 = new People("Gleg", "Kras", 8);
        People p3 = new People("Gasha", "Seghtj", 1);
        List<People> person = new ArrayList<>();
        person.add(p1);
        person.add(p2);
        person.add(p4);
        person.add(p3);
        person.add(p5);



        person.sort(People.ageComparator);

        System.out.println(person);


    }
}
