package pagamentos;
import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-" + new Random().nextInt(1000000);
        System.out.println("[Pix] Código gerado: " + pixCode);
        System.out.println("[Pix] Pagamento de R$" + amount + " realizado com sucesso!");
    }
}
