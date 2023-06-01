import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Exercise 8
public class LuckySortClass {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Cherry");
        strings.add("Pineapple");
        strings.add("Lemon");

        luckySort(strings, String::compareTo);
        System.out.println(strings);
    }
    private static boolean SortedArray(ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (!SortedArray(strings, comp)) {
            Collections.shuffle(strings);
        }
    }

}

