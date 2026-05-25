public class Rectangle implements Shape{

    private final double width;
    private final double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return width * height;
    }


}
