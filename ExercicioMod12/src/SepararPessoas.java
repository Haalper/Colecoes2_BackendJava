import java.util.*;

public class SepararPessoas {
    public static void main(String[] args) {

        Map<String, List<String>> pessoas = new HashMap<>();

        pessoas.put("Masculino", new ArrayList<>());
        pessoas.put("Feminino", new ArrayList<>());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Digite o sexo da pessoa (Masculino/Feminino): ");
            String sexo = scanner.nextLine().trim();

            if (sexo.equalsIgnoreCase("Masculino")) {
                pessoas.get("Masculino").add(nome);
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                pessoas.get("Feminino").add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite 'Masculino' ou 'Feminino'.");
            }
        }

        System.out.println("\nPessoas separadas por sexo:");
        for (Map.Entry<String, List<String>> entry : pessoas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
