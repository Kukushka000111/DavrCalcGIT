class Converter {
    public static int parseNumber(String numberStr, int numberSystem) throws NumberFormatException {
        try {
            return Integer.parseInt(numberStr, numberSystem);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("����������� ������ ��� ������ �������");
        }
    }

    public static String getPrefix(int numberSystem) {
        return switch (numberSystem) {
            case 2 -> "0b";
            case 8 -> "0";
            case 16 -> "0x";
            default -> "";
        };
    }
}