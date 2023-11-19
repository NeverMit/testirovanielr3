import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество вопросов для экзамена");
        int a=scanner.nextInt();
        if(a<=0){
            System.out.println("Недопустимое значение");
        }
        else {
            System.out.println("Введите количество вопросов, которые выучил студент");
            int b=scanner.nextInt();
            if(a<b||b<=0) {
                System.out.println("Недопустимое значение");
            }
            else {
                if(b>=0.9*a) System.out.println("Студент сдал на 5");
                else if(b>=0.75*a) System.out.println("Студент сдал на 4");
                else if(b<0.75*a&&b>=0.5*a) System.out.println("Студент сдал на 3");
                else System.out.println("Студент не сдал");
            }
        }
    }
}
