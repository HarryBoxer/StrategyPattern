public class TaxTH implements CalculateTax {

    @Override
    public double calculateTax(double purchase) {
        return purchase*0.07;

    }
}
