import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner. nextInt();

        Pessoa fulano = new Pessoa(nome, idade, 1.90, 100, "Masculino");

        fulano.imprimir();

        scanner.close();
        

    }
}

