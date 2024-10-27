import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o fatorial: ");
        int numeroUsuario = scanner.nextInt();
        int numeroFatorial = 1;
        for (int i = 1; i <= numeroUsuario ; i++) {
            numeroFatorial *= i;
        }
        System.out.println("O fatoria de "+numeroUsuario+" é: "+numeroFatorial);
    }
}
