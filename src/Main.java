import java.util.Scanner;
//variant 14
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int s = 0;
        int firstPositiveIndex=0;
        int lastPositiveIndex=0;
        for (int i = 0; i < array.length; i++)
            array[i] = scanner.nextInt();
        int a=123;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        for(int i=0;i< array.length;i++)
            if(array[i]>0) {
                firstPositiveIndex=i;
                break;
            }
        for (int i= array.length-1;i>0;i--)
            if(array[i]>0){
                lastPositiveIndex=i;
                break;
            }
        for(int i=firstPositiveIndex+1;i<=lastPositiveIndex-1;i++)
            s+=array[i];
        System.out.println();
        System.out.println(s);
        System.out.println("hui");
        System.out.println("pizda");
    }
}
