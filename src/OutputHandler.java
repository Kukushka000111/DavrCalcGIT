class OutputHandler {
    public static void printResult(int result) {
        System.out.println("\nОтвет в разных системах:");
        System.out.println("Двоичная:      0b" + Integer.toBinaryString(result));
        System.out.println("Восьмеричная:       0" + Integer.toOctalString(result));
        System.out.println("Десятичная:     " + result);
        System.out.println("Шестьнадцатеричная: 0x" + Integer.toHexString(result).toUpperCase());
    }
}