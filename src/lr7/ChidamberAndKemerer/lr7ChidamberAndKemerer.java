package lr7.ChidamberAndKemerer;

public class lr7ChidamberAndKemerer {
    public static void main(String[] args) {
        Point a1=new Point(1,3);
        Point a2=new Point(6,1);
        Rectangle rectangle=new Rectangle(a1,a2);
        System.out.println("Площадь равна: "+rectangle.calculateArea());
        System.out.println("Периметр равна: "+rectangle.calculatePerimeter());
    }
}
