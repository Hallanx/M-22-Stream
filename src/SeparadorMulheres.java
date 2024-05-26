import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeparadorMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes separados por vírgula (ex: Maria,Fernando,João): ");
        String input = scanner.nextLine();

        String[] nomesArray = input.split(",");
        for (String nome : nomesArray) {
            nomes.add(nome.trim());
        }

        List<String> mulheres = nomes.stream()
                .filter(nome -> {
                    System.out.print("Digite o sexo de " + nome + " (M para masculino, F para feminino): ");
                    String sexo = scanner.nextLine().trim().toLowerCase();
                    return sexo.equals("f");
                })
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\n--- Grupo de Mulheres (em ordem alfabética) ---");
        mulheres.forEach(System.out::println);

        scanner.close();
    }
}
