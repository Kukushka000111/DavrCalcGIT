class OutputHandler {
    public static void printResult(int result) {
        System.out.println("\n����� � ������ ��������:");
        System.out.println("��������:      0b" + Integer.toBinaryString(result));
        System.out.println("������������:       0" + Integer.toOctalString(result));
        System.out.println("����������:     " + result);
        System.out.println("������������������: 0x" + Integer.toHexString(result).toUpperCase());
    }
}