class Converter {
    public static int parseNumber(String numberStr) throws NumberFormatException {
        if (numberStr.startsWith("0b") || numberStr.startsWith("0B")) {
            return Integer.parseInt(numberStr.substring(2), 2);
        }
        try {
            return Integer.decode(numberStr);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат числа: " + numberStr);
        }
    }
}