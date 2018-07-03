package chapter9udemy.data_structure.sorting_collection;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        int num1 = s1.length();
        int num2 = s2.length();

        if (num1 > num2) {
            return 1;
        }
        if (num1 < num2) {
            return -1;
        }
        return 0;
    }
}
