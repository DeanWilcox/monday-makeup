public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        A a = new A();

        // Create instances of the shape classes
        Circle circle = new Circle(5);
        final Rectangle rectangle = Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
    
        // Perform ops on shapes
        double circleArea = circle.getArea();
        double rectanglePerimeter = rectangle.getPerimeter();
        double triangleArea = triangle.getArea();
    
        // Print results to console
        System.out.println("Circle area: " + circleArea);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);
        System.out.println("Triangle area: " + triangleArea);
}

    private static Rectangle Rectangle(int i, int j) {
        return null;
    }
}