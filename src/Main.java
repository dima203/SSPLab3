import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StackInterpreter interpreter = new StackInterpreter();
        interpreter.interpret(new FileReader("./stack_program.txt"));
    }
}
