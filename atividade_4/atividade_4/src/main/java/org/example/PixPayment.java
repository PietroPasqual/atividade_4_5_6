package org.example;

import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-" + new Random().nextInt(1000000);
        System.out.println("Pagamento via Pix processado!");
        System.out.println("Código Pix: " + pixCode);
        System.out.println("Valor: R$ " + amount);
    }
}
