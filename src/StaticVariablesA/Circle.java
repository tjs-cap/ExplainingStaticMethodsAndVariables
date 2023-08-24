package StaticVariablesA;

class Circle {
    static final double PI = 3.14159; // Static constant

    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return PI * radius * radius; // Using static constant
    }
}

