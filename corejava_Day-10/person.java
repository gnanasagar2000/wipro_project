import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class person {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("elon", 39));
        people.add(new Person("manoj", 27));
        people.add(new Person("sanjay", 30));
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        people.sort(nameComparator);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}


