public class Main {
    public static void main(String args[]){

        Circle circle = new Circle("red", 3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        circle.display();
        System.out.println();

        Rectangle rectangle  = new Rectangle("orange", 20, 10);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        rectangle.display();
        System.out.println();


        Triangle triangle = new Triangle("yellow", 10, 5);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());
        triangle.display();
        System.out.println();


        Square square = new Square("White", 10);
        System.out.println(circle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        square.display();
    
    }

}
