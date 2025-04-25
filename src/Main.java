import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = null;

        //����� ������� ���������
        while (true){
            System.out.println("\n����������� ������������");
            System.out.println("�������� ������� ���������: ");
            System.out.println("1. �������� (2)");
            System.out.println("2. ������������ (8)");
            System.out.println("3. ���������� (10)");
            System.out.println("4. ����������������� (16)");
            System.out.println("5. �����");

            int choose = 0;
            int SysChis = 0;
            while (true) {
                try{
                    choose = scanner.nextInt();
                    if (choose < 1 || choose > 5){
                        System.out.println("������� ������� �������");
                        continue;
                    }
                    if (choose == 5){
                        return;
                    }
                }
                catch (Exception e){
                    System.out.println("��������� ������ �����");
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

            //����� ��������
            System.out.println("��������, ����� �������� ������ ���������:");
            System.out.println("1. ��������");
            System.out.println("2. ���������");
            System.out.println("3. ���������");
            System.out.println("4. �������");
            int operator = 0;
            while (true){
                try {
                    operator = scanner.nextInt();
                    if (operator < 1 || operator > 4){
                        System.out.println("������� ������� �������");
                        continue;
                    }
                    break;
                }
                catch (Exception e){
                    System.out.println("��������� ������ �����");
                    scanner.next();
                }
            }

            //���� �����
            long num1;
            long num2;
            System.out.println("������� ������ ����� � ��������� �������");
            while (true) {
                String StrNum1 = scanner.next();
                try {
                    num1 = calc.parse(StrNum1);
                    break;
                } catch (Exception e) {
                    System.out.println("�������� ������ ����� ��� ��������� �������!");
                }
            }
            System.out.println("������� ������ ����� � ��������� �������");
            while (true) {
                String StrNum2 = scanner.next();
                try {
                    num2 = calc.parse(StrNum2);
                    if (operator == 4 && num2 == 0) {
                        System.out.println("������� �������� �������� �� 0");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("�������� ������ ����� ��� ��������� �������!");
                }
            }

            //���������� �������� � ����� ����������
            long result = calc.calculate(num1,num2,operator);

            System.out.println("\n���������:");
            System.out.println("��������: " + Long.toBinaryString(result));
            System.out.println("������������: " + Long.toOctalString(result));
            System.out.println("����������: " + result);
            System.out.println("�����������������: " + Long.toHexString(result));
            System.out.println("___________________________________");
        }
    }
}