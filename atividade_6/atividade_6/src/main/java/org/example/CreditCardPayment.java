package org.example;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String creditCardNumber = "1234-5678-9876-5432";
        System.out.println("Pagamento de R$" + amount + " realizado via Cartão de Crédito. Número do cartão: " + creditCardNumber);
    }
}