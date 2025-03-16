package pagamentos;
import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void processPayment(double amount) {
        System.out.print("[Cartão de Crédito] Digite o número do cartão: ");
        String cardNumber = scanner.nextLine();
        System.out.println("[Cartão de Crédito] Pagamento aprovado para o cartão " + cardNumber);
        System.out.println("[Cartão de Crédito] Valor pago: R$" + amount);
    }
}
