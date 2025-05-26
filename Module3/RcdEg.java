import java.util.*;
import java.util.stream.Collectors;

record Pname(String n, int age) {}

public class RcdEg {
    public static void main(String[] args) {
        Pname p1 = new Pname("Alice", 25);
        Pname p2 = new Pname("Bob", 17);
        Pname p3 = new Pname("Charlie", 30);
        Pname p4 = new Pname("David", 15);
        List<Pname> ple = Arrays.asList(p1, p2, p3, p4);
        List<Pname> adlts = ple.stream().filter(p -> p.age() >= 18)
      .collect(Collectors.toList());
  System.out.println("\nAdults (age >= 18):");
        for (Pname person : adlts) {
            System.out.println(person);
        }
    }
}
