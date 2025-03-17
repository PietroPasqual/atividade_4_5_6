package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + new Random().nextInt(1000000);
        System.out.println("Pagamento via Boleto gerado!");
        System.out.println("Código do Boleto: " + boletoCode);
        System.out.println("Valor: R$ " + amount);
    }
}
