import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Triangle triangle = new Triangle(3, 3, 2);
        Triangle triangle2 = new Triangle(2, 3, 3);
        System.out.println(triangle.calculateSquare());
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle);
        System.out.println(triangle.equals(triangle2));

        StackInterpreter stackInterpreter = new StackInterpreter();
        try (FileReader file = new FileReader("fhkj")) {
            stackInterpreter.interpret(new InputStreamReader(System.in));
        }
    }
}
