package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha o método de pagamento:");
        System.out.println("1. Pix");
        System.out.println("2. Cartão de Crédito");
        System.out.println("3. Boleto");

        int choice = scanner.nextInt();


        System.out.print("Digite o valor da transação: R$");
        double amount = scanner.nextDouble();


        PaymentStrategy paymentStrategy = PaymentFactory.createPaymentMethod(choice);


        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(amount);

        scanner.close();
    }
}