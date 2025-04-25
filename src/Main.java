
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = InputHandler.getNumber(scanner, "������� ������ �����: ");
            String operator = InputHandler.getOperator(scanner);
            int num2 = InputHandler.getNumber(scanner, "������� ������ �����: ");

            int result = Calculator.calculate(num1, num2, operator);
            OutputHandler.printResult(result);
        } catch (ArithmeticException e) {
            System.out.println("������: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("����������� ������: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}







