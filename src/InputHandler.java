import java.util.Scanner;

class InputHandler {
    public static int getNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Converter.parseNumber(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: " + e.getMessage() + ". Попробуй снова.");
            }
        }
    }

    public static String getOperator(Scanner scanner) {
        while (true) {
            System.out.print("Введите операцию (+, -, *, /): ");
            String op = scanner.nextLine().trim();
            if (op.matches("[+\\-*/]")) {
                return op;
            }
            System.out.println("Неизвестная операция. Пожалуйста введите +, -, *, или /.");
        }
    }
}