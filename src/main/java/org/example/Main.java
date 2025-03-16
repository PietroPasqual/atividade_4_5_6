package pagamentos;
public class Main {
    public static void main(String[] args) {
        PaymentMenu menu = new PaymentMenu();
        PaymentStrategy strategy = menu.selectPaymentMethod();
        double amount = menu.getTransactionAmount();

        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.executePayment(amount);
    }
}
