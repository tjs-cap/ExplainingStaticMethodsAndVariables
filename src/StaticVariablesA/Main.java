package StaticVariablesA;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(8);

        System.out.println(circle1.calculateArea()); // Outputs: 78.53975
        System.out.println(circle2.calculateArea()); // Outputs: 201.06176
    }
}
