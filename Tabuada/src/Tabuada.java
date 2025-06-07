import java.util.Scanner;

public class Tabuada { // declara a classe chamada Tabuada
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cria objeto da classe scanner para ler as entradas do teclado

        System.out.println("\n📚✨ Bem-vindo(a) à Tabuada Hacker ✨📚");
        System.out.print("\uD83D\uDD22 Digite um número para ver a tabuada: "); // pede ao usuário que digite um número
        int numero = scanner.nextInt(); // lê o número digitado e guarda na variável "número"

        System.out.println("\n🎯 Tabuada do " + numero + ":"); // exibe um título antes de exibir a tabuada
        System.out.println("-----------------------------");
        for (int i = 1; i <= 10; i++) { // laço for que vai de 1 até 10 para gerar a tabuada
            int resultado = numero * i; // calcula o valor da multiplicação
            System.out.printf("👉 %2d x %2d = %3d\n", numero, i, resultado); // mostra uma linha da tabuada: ex 5 x 3 = 15
        }

        System.out.println("-----------------------------");
        System.out.println("✅ Tabuada finalizada com sucesso! 🚀");
    }
}