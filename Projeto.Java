import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                int a = input.nextInt();

                System.out.print("Digite o segundo número: ");
                int b = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + a + b);
                        break;
                    case 2:
                        System.out.println("Resultado: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + a * b);
                        break;
                    case 4:
                        System.out.println("Resultado: " + a / b);
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("👋 Até mais!");
        input.close();
    }
}
