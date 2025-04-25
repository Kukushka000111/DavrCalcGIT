
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Выберите систему счисления:");
            System.out.println("1 - Двоичная");
            System.out.println("2 - Восьмеричная");
            System.out.println("3 - Десятичная");
            System.out.println("4 - Шестнадцатеричная");
            int numberSystem = InputHandler.getNumberSystem(scanner);

            int num1 = InputHandler.getNumber(scanner, "Введите первое число: ", numberSystem);
            String operator = InputHandler.getOperator(scanner);
            int num2 = InputHandler.getNumber(scanner, "Введите второе число:: ", numberSystem);

            int result = Calculator.calculate(num1, num2, operator);
            OutputHandler.printResult(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}







