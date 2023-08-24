package StaticVariablesB;

public class Main {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        System.out.println(MyClass.staticCounter); // Outputs: 2 (two instances created)
    }
}
