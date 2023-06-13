package comparatop;

import java.util.Comparator;

public class People {


    private String name;
    private int mark;
    private String lastName;

    public String getName() {
        return name;
    }


    public int getMark() {
        return mark;
    }

    public String getLastName() {
        return lastName;
    }
    public static Comparator<People> ageComparator = new Comparator<>() {//last name, name, mark
        @Override
        public int compare(People o1, People o2) {
            int lastName = o1.getLastName().compareTo(o2.getLastName());
            if (lastName == 0) {
                int name = o1.getName().compareTo(o2.getName());
                if (name == 0) {
                    return o1.getMark() - o2.getMark();
                } else {
                    return name;
                }

            } else return lastName;

        }
    };

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


}
