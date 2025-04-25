public abstract class Calculator {

    //
    public abstract long parse(String input);

    //
    public abstract String format(int number);

    //
    public abstract int getSystem();

    //
    public long calculate(long num1, long num2, int operator) {
        return switch (operator) {

            case 1 -> num1 + num2;

            case 2 -> num1 - num2;

            case 3 -> num1 * num2;

            case 4 -> num1 / num2;

            default -> throw new IllegalArgumentException("Неизвестная операция: " + operator);
        };
    }
}
