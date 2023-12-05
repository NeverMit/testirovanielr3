import java.util.Scanner;
public class lr6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n=scanner.nextInt();
        int [] result=countDigitsAndSum(n);
        System.out.println("Количество цифр в числе = "+result[0]);
        System.out.println("Сумма цифр в числе = "+result[1]);
    }
    public static int[] countDigitsAndSum(int n){
        int count=0;
        int sum=0;
        while(n>0){
            int digit=n%10;
            count++;
            sum+=digit;
            n/=10;
        }
        return new int[]{count,sum};
    }
}
