import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("������� ���������� �������� ��� ��������");
        int a=scanner.nextInt();
        if(a<=0){
            System.out.println("������������ ��������");
        }
        else {
            System.out.println("������� ���������� ��������, ������� ������ �������");
            int b=scanner.nextInt();
            if(a<b||b<=0) {
                System.out.println("������������ ��������");
            }
            else {
                if(b>=0.9*a) System.out.println("������� ���� �� 5");
                else if(b>=0.75*a) System.out.println("������� ���� �� 4");
                else if(b<0.75*a&&b>=0.5*a) System.out.println("������� ���� �� 3");
                else System.out.println("������� �� ����");
            }
        }
    }
}
