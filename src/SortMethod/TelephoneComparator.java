package SortMethod;
import java.util.Comparator;

public class TelephoneComparator implements Comparator {
    Comparator cmp;
    @Override
    public int compare(Object o1, Object o2) {
        Telephone one = (Telephone) o1;
        Telephone two = (Telephone) o2;

        if (one.getNumber() < two.getNumber()) return -1;
        else if (one.getNumber() == (two.getNumber())) return 0;
        else return 1;
    }
}
