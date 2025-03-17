package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void processPayment(double amount) {
        System.out.print("Digite o número do cartão de crédito: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento via Cartão de Crédito aprovado!");
        System.out.println("Cartão: " + cardNumber);
        System.out.println("Valor: R$ " + amount);
    }
}
