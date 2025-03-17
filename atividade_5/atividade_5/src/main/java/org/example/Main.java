package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        System.out.print("Opção: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite a mensagem a ser enviada: ");
        String message = scanner.nextLine();

        String type = switch (option) {
            case 1 -> "email";
            case 2 -> "sms";
            case 3 -> "push";
            default -> "";
        };

        Notification notification = NotificationFactory.createNotification(type);
        if (notification == null) {
            System.out.println("Opção inválida.");
            return;
        }

        notification.send(message);
    }
}
