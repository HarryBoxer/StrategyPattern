public class Main {
    public static void main(String[] args) {

        CashRegister regisPattern = new CashRegister(new TaxTH());

        regisPattern.recordPurchase(60);
        regisPattern.recordPurchase(40);
        regisPattern.calculateTax();
        regisPattern.enterPayment(200);

        double change = regisPattern.giveChange();
        System.out.println(change);
    }

}
