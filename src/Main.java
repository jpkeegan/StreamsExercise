import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<String> potterProfs = new ArrayList<>();

        potterProfs.add("Albus Dumbledore");
        potterProfs.add("Severus Snape");
        potterProfs.add("Minerva McGonagall");
        potterProfs.add("Filius Flitwick");
        potterProfs.add("Aurora Sinistra");
        potterProfs.add("Alastor Moody");
        potterProfs.add("Remus Lupin");

        System.out.println("Original list: " + potterProfs);

        // Filter professors whose name starts with "A"
        List<String> filteredProfs = potterProfs.stream().filter(prof -> prof.startsWith("A")).toList();
        System.out.println("Filtered for names starting with A: " + filteredProfs);

        // Map each profs name to its length
        List<Integer> nameLengths = potterProfs.stream().map(String::length).toList();
        System.out.println("Mapped name lengths: " + nameLengths);

        // sort Profs alphabetically
        List<String> sortedProfs = potterProfs.stream().sorted().toList();
        System.out.println("Sorted profs: " + sortedProfs);

        // Print each prof with name uppercase (forEach)
        potterProfs.stream().map(String::toUpperCase).forEach(System.out::println);

        // concatenate all profs names into a single string (reduce)
        String concNames = potterProfs.stream().reduce("",(acc, profs) -> acc + profs);
        System.out.println("Reduced names: " + concNames);

        // Count the total number of characters in all professor names
        int totalNameLength = potterProfs.stream().mapToInt(String::length).sum();
        System.out.println("Total name length: " + totalNameLength);

        // Collect professors whose name ends with "n" into a new list
        List<String> endsWithN = potterProfs.stream().filter(prof -> prof.endsWith("e")).toList();
        System.out.println("Professors whose name ends with 'e': " + endsWithN);


    }
}