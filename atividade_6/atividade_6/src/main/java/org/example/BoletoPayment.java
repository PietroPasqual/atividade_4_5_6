package org.example;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + (int) (Math.random() * 10000);
        System.out.println("Pagamento de R$" + amount + " realizado via Boleto. Código: " + boletoCode);
    }
}