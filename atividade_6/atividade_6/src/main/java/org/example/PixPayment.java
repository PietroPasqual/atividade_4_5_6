package org.example;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-" + (int) (Math.random() * 10000);
        System.out.println("Pagamento de R$" + amount + " realizado via Pix. Código: " + pixCode);
    }
}
