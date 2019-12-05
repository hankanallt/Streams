package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import static jdk.nashorn.internal.objects.NativeArray.map;
import java.util.HashMap;
import java.util.stream.Collectors;

/*Streams
MADE EASY

Lambdas and Streams APIs, a part of the Java 8 release

Substituting the old way of iterating over a collection with the new Java 8 way

Benefits: increase in performance when processing collections

Calling the stream( ) method turns the ArrayList ArrayList<Artist> artists = new ArrayList<>();
of artists into a Stream of artists  Streams<Strings> artists = new Artist.Stream();
 */
public class Streamss {

    public static void main(String[] args) {

        ArrayList<Artist> artists = new ArrayList<>();
        //map<int, Double> integers = new Hashmap<>();

        //String name, String lastname, String type, int age, Double Salary
        artists.add(new Artist("Madonna", "??", "Singer", 65, 15500.0));
        artists.add(new Artist("Jay", "Sean", "Singer", 40, 40000.0));
        artists.add(new Artist("Kent", "Ahmed", "Singer", 37, 30000.0));
        artists.add(new Artist("Asha", "Bhosle", "Singer", 70, 100000.0));
        artists.add(new Artist("Kumar", "Sanu", "Singer", 55, 70000.0));

//        Predicate<Artist> p = new Predicate<Artist>() {
//            @Override
//            public boolean test(Artist t) {
//                return t.Salary > 40000;
//            }
//        };
//        Predicate<Artist> p =  t -> t.Salary < 40000;
        Comparator<Artist> sbn = (o1, o2) -> o1.getName().compareTo(o2.getName());

        Consumer<Artist> x = (Artist t) -> {
            System.out.println(t.getName());
        };

        artists.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .peek(e -> System.out.println(e))
                .sorted((o1, o2) -> o1.getAge() - (o2.getAge()))
                .peek(e -> System.out.println(e))
                .sorted((o1, o2) -> o1.getLastname().compareTo(o2.getLastname()))
                .peek(e -> System.out.println(e))
                .sorted((o1, o2) -> o1.getType().compareTo(o2.getType()))
                .peek(e -> System.out.println(e))
                .sorted((o1, o2) -> (int) (o2.getSalary() - (o1.getSalary())))
                .filter(t -> t.Salary < 40000)
                .filter(t -> t.age < 100)
                .map(artist -> new Student(artist.name))
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .filter(student1 -> student1.name.length() < 5)
        .collect(Collectors.toList());
//        forEach(t -> System.out.println(t));

    }

}
