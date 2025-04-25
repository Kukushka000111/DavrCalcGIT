
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = InputHandler.getNumber(scanner, "Введите первое число: ");
            String operator = InputHandler.getOperator(scanner);
            int num2 = InputHandler.getNumber(scanner, "Введите второе число: ");

            int result = Calculator.calculate(num1, num2, operator);
            OutputHandler.printResult(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}







