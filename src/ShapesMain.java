
public class ShapesMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(12),
                new Rectangle(18,18),
                new Triangle(30,30,30)
        };

        for (int i = 0; i < shapes.length; i++) {
            printShapeInfo(shapes[i]);
        }

    }

    public static void printShapeInfo(Shape s){
        System.out.println("area=" + s.getArea());
        System.out.println("perimeter=" + s.getPerimeter());
    }
}
