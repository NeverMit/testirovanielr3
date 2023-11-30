import java.util.*;

public class lr5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число элементов массива");
        int n=scanner.nextInt();
        if(n<=0) System.out.println("Недопустимое значение размера массива");
        else {
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Введите "+(i+1)+" элемент массива");
                a[i]=scanner.nextInt();
            }
            module1(a,n);
            module2(a,n);
            module3(a,n);
        }
    }
    public static int module1(int [] a,int n){
        int k=0;
        for(int i=0;i<n;i++)
            if(a[i]==0) k++;
        if(k==0)
            System.out.println("В массиве нет элементов, равных нулю");
        else if(k>0)
            System.out.println("Количество элементов равных нулю: "+k);
        return k;
    }
    public static int module2(int []a ,int n){
        int indexOfMinValue=n-1;
        int sum=0;
        if(n==1) System.out.println("В массиве один элемент, "+
                "соответственно он и является минимальным, "+
                "а значит и сумма равна 0");
        else if(n>1){
            for(int i=0;i<n;i++)
                if(a[i]==findMinElement(a)) {
                    indexOfMinValue = i;
                   break;
                }
            for(int i=indexOfMinValue+1;i<n;i++)
                sum+=a[i];
            if(sum==0) System.out.println("Последний элемент является минимальным, а значит сумма равна нулю");
            else System.out.println("Сумма элементов, расположенных после минимального, равна: "+sum);
        }
        return sum;
    }
    public static int findMinElement(int []a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
            if(a[i]<min)min=a[i];
        return min;
    }
    public static void module3(int []a ,int n){
        if(n==1) System.out.println("Массив состоит из одного элемента, сортировать нечего");
        else {
            Comparator absComparator = new AbsComparator();
            List<Integer> aList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                aList.add(i, a[i]);
            }
            Collections.sort(aList, absComparator);
            for (int i = 0; i < n; i++) {
                System.out.print(aList.get(i) + " ");
            }
        }
    }
}
