package pagamentos;
import java.util.Scanner;

public class PaymentMenu {
    private final Scanner scanner = new Scanner(System.in);

    public PaymentStrategy selectPaymentMethod() {
        System.out.println("Selecione o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Opção: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1: return new PixPayment();
            case 2: return new CreditCardPayment();
            case 3: return new BoletoPayment();
            default:
                System.out.println("Opção inválida! Encerrando programa.");
                System.exit(1);
                return null;
        }
    }

    public double getTransactionAmount() {
        System.out.print("Digite o valor da transação: R$");
        return scanner.nextDouble();
    }
}
