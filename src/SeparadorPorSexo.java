import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SeparadorPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();

        System.out.println("Digite os nomes separados por vírgula (ex: Maria,Fernando,João): ");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        for (String nome : nomes) {
            nome = nome.trim();

            System.out.print("Digite o sexo de " + nome + " (M para masculino, F para feminino): ");
            String sexo = scanner.nextLine().trim().toLowerCase();

            if (sexo.equals("m")) {
                homens.add(nome);
            } else if (sexo.equals("f")) {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido para " + nome + ". Por favor, digite M para masculino ou F para feminino.");
            }
        }

        Collections.sort(homens);
        Collections.sort(mulheres);

        System.out.println("\n--- Grupo de Homens (em ordem alfabética) ---");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("\n--- Grupo de Mulheres (em ordem alfabética) ---");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }

        scanner.close();
    }
}
