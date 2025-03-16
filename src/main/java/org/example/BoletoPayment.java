package pagamentos;
import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + new Random().nextInt(1000000);
        System.out.println("[Boleto] Código do boleto: " + boletoCode);
        System.out.println("[Boleto] Pagamento de R$" + amount + " aguardando compensação.");
    }
}
