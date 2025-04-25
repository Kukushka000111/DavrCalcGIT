import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = null;

        //Выбор системы счисления
        while (true){
            System.out.println("\nКалькулятор программиста");
            System.out.println("Выберете систему счисления: ");
            System.out.println("1. Двоичная (2)");
            System.out.println("2. Восьмеричная (8)");
            System.out.println("3. Десятичная (10)");
            System.out.println("4. Шестнадцатеричная (16)");
            System.out.println("5. Выход");

            int choose = 0;
            int SysChis = 0;
            while (true) {
                try{
                    choose = scanner.nextInt();
                    if (choose < 1 || choose > 5){
                        System.out.println("Неверно выбрана команда");
                        continue;
                    }
                    if (choose == 5){
                        return;
                    }
                }
                catch (Exception e){
                    System.out.println("Произошла ошибка ввода");
                    scanner.next();
                    continue;
                }
                switch (choose){
                    case 1:
                        calc= new BinSys();
                        break;
                    case 2:
                        calc= new OctSys();
                        break;
                    case 3:
                        calc= new DecSys();
                        break;
                    case 4:
                        calc= new HexSys();
                        break;
                }
                break;
            }

            //Выбор операции
            System.out.println("Выберете, какую операцию хотите выполнить:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            int operator = 0;
            while (true){
                try {
                    operator = scanner.nextInt();
                    if (operator < 1 || operator > 4){
                        System.out.println("Неверно выбрана команда");
                        continue;
                    }
                    break;
                }
                catch (Exception e){
                    System.out.println("Произошла ошибка ввода");
                    scanner.next();
                }
            }

            //Ввод чисел
            long num1;
            long num2;
            System.out.println("Введите первое число в выбранной системе");
            while (true) {
                String StrNum1 = scanner.next();
                try {
                    num1 = calc.parse(StrNum1);
                    break;
                } catch (Exception e) {
                    System.out.println("Неверный формат числа для выбранной системы!");
                }
            }
            System.out.println("Введите второе число в выбранной системе");
            while (true) {
                String StrNum2 = scanner.next();
                try {
                    num2 = calc.parse(StrNum2);
                    if (operator == 4 && num2 == 0) {
                        System.out.println("Введите значение отличное от 0");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Неверный формат числа для выбранной системы!");
                }
            }

            //Выволнение операции и вывод результата
            long result = calc.calculate(num1,num2,operator);

            System.out.println("\nРезультат:");
            System.out.println("Двоичный: " + Long.toBinaryString(result));
            System.out.println("Восьмеричный: " + Long.toOctalString(result));
            System.out.println("Десятичный: " + result);
            System.out.println("Шестнадцатеричный: " + Long.toHexString(result));
            System.out.println("___________________________________");
        }
    }
}