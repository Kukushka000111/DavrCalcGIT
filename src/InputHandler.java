import java.util.Scanner;

class InputHandler {
    public static int getNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Converter.parseNumber(input);
            } catch (NumberFormatException e) {
                System.out.println("������: " + e.getMessage() + ". �������� �����.");
            }
        }
    }

    public static String getOperator(Scanner scanner) {
        while (true) {
            System.out.print("������� �������� (+, -, *, /): ");
            String op = scanner.nextLine().trim();
            if (op.matches("[+\\-*/]")) {
                return op;
            }
            System.out.println("����������� ��������. ���������� ������� +, -, *, ��� /.");
        }
    }
}