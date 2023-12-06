package lr7.ChidamberAndKemerer;

public class Rectangle{
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public double calculateArea(){
        double width=Math.abs(bottomRight.getX()-topLeft.getX());
        double height=Math.abs(topLeft.getY()-bottomRight.getY());
        return width*height;
    }
    public double calculatePerimeter(){
        double width = Math.abs(bottomRight.getX() - topLeft.getX());
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        return 2 * (width + height);
    }
}
