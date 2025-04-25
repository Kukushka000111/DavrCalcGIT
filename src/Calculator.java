class Calculator {
    public static int calculate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if (num2 == 0) throw new ArithmeticException("Отличное от нуля!");
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Неизвестная операция: " + operator);
        };
    }
}