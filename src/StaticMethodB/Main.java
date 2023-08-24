package StaticMethodB;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";
        boolean isEmpty = StringUtils.isEmpty(text); // Calling static method

        System.out.println("Is the text empty? " + isEmpty); // Outputs: Is the text empty? false
    }
}
