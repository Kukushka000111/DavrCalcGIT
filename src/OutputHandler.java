
class OutputHandler {
    public static void printResult(int result) {
        System.out.println("\nОтвет в разных системах:");
        System.out.println("Двоичная:      0b" + Integer.toBinaryString(result));
        System.out.println("Восьмиричная:       0" + Integer.toOctalString(result));
        System.out.println("Десетичная:     " + result);
        System.out.println("Шестнадцатеричная: 0x" + Integer.toHexString(result).toUpperCase());
    }
}