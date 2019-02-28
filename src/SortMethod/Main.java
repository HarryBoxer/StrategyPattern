package SortMethod;
import java.util.Comparator;

public class Main {

    public static void sort(Object[] data, Comparator cmp) {
        // i divides array into two parts: already-sorted, not sorted
        for (int i = 0; i < data.length - 1; i++) {
            int minPos = i;

            // loop to find index containing a minimum value
            for (int j = i + 1; j < data.length; j++) {
                if (cmp.compare(data[j],data[minPos]) < 0) {
                    minPos = j;
                }
            }
            // swap minPos and i so that data in minPos index will
            // be the already-sorted part
            Object temp = data[minPos];
            data[minPos] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String[] args) {
        Telephone a[] = {new Telephone((long)921214142) ,
                new Telephone((long)987765434) ,
                new Telephone((long)998766523) ,
                new Telephone((long)876554887)};
        sort(a,new TelephoneComparator());

        for (Telephone data : a) {
            System.out.println(data.toString());
        }
    }

}
