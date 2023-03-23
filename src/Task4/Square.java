package Task4;

public class Square implements Shape{
    private final double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(size,2);
    }
}
