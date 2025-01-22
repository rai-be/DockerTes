import java.util.ArrayList;
import java.util.Scanner;

public class ListNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.println("Digite números (digite 'sair' para finalizar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número ou 'sair'.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            double sum = 0;
            double max = numbers.get(0);
            double min = numbers.get(0);

            for (double number : numbers) {
                sum += number;
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }

            double average = sum / numbers.size();
            System.out.println("Média: " + average);
            System.out.println("Maior número: " + max);
            System.out.println("Menor número: " + min);
        }

        scanner.close();
    }
}
