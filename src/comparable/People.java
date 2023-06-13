package comparable;

import java.util.Comparator;

public class People implements Comparable<People> {


    private String name;
    private int mark;
    private String lastName;

    public People(String name, String lastName, int mark) {
        this.name = name;
        this.mark = mark;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        String st = name + " " + lastName + " " + mark;
        return st;
    }

    @Override
    public int compareTo(People o) {
        int lastName = this.name.compareTo(o.lastName);
        if (lastName == 0) {
            int name = this.name.compareTo(o.name);
            if (name == 0) {
                return this.mark - o.mark;
            } else {
                return name;
            }

        } else return lastName;


    }
}
