import javafx.scene.shape.Shape;

public class Circle extends Shape {
    private double radius;

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public com.sun.javafx.geom.Shape impl_configShape() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'impl_configShape'");
    }
}
