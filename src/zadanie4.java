import java.util.Scanner;

public class zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �����");
        int number = Math.abs(scanner.nextInt());
        numberOfDigits(number);// ����� ������ ��� �� ������� �������
    }

    //���� ������� ��� ����� ����������� ����
    public static void numberOfDigits(int number) {
        if (number != 0) {
            int length = (int) (Math.log10(number) + 1);
            System.out.println("���������� ��������: " + length);
        } else {
            System.out.println("���������� ��������: " + 1);
        }//���� ������ ����� ������ 0
    }
}