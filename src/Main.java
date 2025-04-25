
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("�������� ������� ���������:");
            System.out.println("1 - ��������");
            System.out.println("2 - ������������");
            System.out.println("3 - ����������");
            System.out.println("4 - �����������������");
            int numberSystem = InputHandler.getNumberSystem(scanner);

            int num1 = InputHandler.getNumber(scanner, "������� ������ �����: ", numberSystem);
            String operator = InputHandler.getOperator(scanner);
            int num2 = InputHandler.getNumber(scanner, "������� ������ �����:: ", numberSystem);

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







