package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Opção: ");
        int option = scanner.nextInt();

        System.out.print("Digite o valor da transação: R$ ");
        double amount = scanner.nextDouble();

        PaymentStrategy paymentStrategy = getPaymentStrategy(option);
        if (paymentStrategy == null) {
            System.out.println("Opção inválida.");
            return;
        }

        PaymentProcessor processor = new PaymentProcessor(paymentStrategy);
        processor.process(amount);
    }

    private static PaymentStrategy getPaymentStrategy(int option) {
        return switch (option) {
            case 1 -> new PixPayment();
            case 2 -> new CreditCardPayment();
            case 3 -> new BoletoPayment();
            default -> null;
        };
    }
}
