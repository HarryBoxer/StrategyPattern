package SortMethod;

public class Telephone  {
    private Long number;

    public Telephone(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Telephone " +
                "number=" + number ;
    }
}
