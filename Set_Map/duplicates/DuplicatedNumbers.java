import java.util.*;

public class DuplicatedNumbers {

    // static public TreeSet<Integer> isFind(int[] integers) {
    //     TreeMap<Integer, Integer> frequency = new TreeMap<Integer,Integer>();

    //     for (Integer integer: integers) {
    //         if (!frequency.containsKey(integer)) {
    //             frequency.put(integer, 0);
    //         }

    //         frequency.put(integer, frequency.get(integer) + 1);
    //     }

    //     TreeSet<Integer> duplicates = new TreeSet<Integer>();

    //     for (Integer integer: frequency.keySet()) {
    //         if (frequency.get(integer) > 1) {
    //             duplicates.add(integer);
    //         }
    //     }

    //     return duplicates;
    // }

    static public TreeSet<Integer> isFind(int[] integers) {
        TreeSet<Integer> duplicates = new TreeSet<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (Integer integer: integers) {
            if (!set.add(integer)) {
                duplicates.add(integer);
            }
        }

        return duplicates;
    }
}