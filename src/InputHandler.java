import java.util.Scanner;
class InputHandler {
    public static int getNumberSystem(Scanner scanner) {
        while (true) {
            System.out.print("Выберите систему (1-4): ");
            String input = scanner.nextLine().trim();
            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 4) {
                    return switch (choice) {
                        case 1 -> 2;
                        case 2 -> 8;
                        case 3 -> 10;
                        case 4 -> 16;
                        default -> 10;
                    };
                }
                System.out.println("Пожалуйста выберите от 1 до 4");
            } catch (NumberFormatException e) {
                System.out.println("Неизвестный формат. Пожалуйста выберите от 1 до 4");
            }
        }
    }

    public static int getNumber(Scanner scanner, String prompt, int numberSystem) {
        String prefix = Converter.getPrefix(numberSystem);
        while (true) {
            System.out.print(prompt + " (" + prefix + " формат): ");
            String input = scanner.nextLine().trim();
            try {
                return Converter.parseNumber(input, numberSystem);
            } catch (NumberFormatException e) {
                System.out.println("Оишбка: " + e.getMessage() + ". Попробуйте ещё раз.");
            }
        }
    }

    public static String getOperator(Scanner scanner) {
        while (true) {
            System.out.print("Выберите операцию (+, -, *, /): ");
            String op = scanner.nextLine().trim();
            if (op.matches("[+\\-*/]")) {
                return op;
            }
            System.out.println("Неизвестная операция. Пожалуйста выберите +, -, *, или /.");
        }
    }
}
