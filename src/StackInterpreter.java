import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackInterpreter {
    private Stack<Double> _stack = new Stack<>();

    public StackInterpreter() {

    }

    public void interpret(InputStreamReader commandStream) {
        BufferedReader commandReader = new BufferedReader(commandStream);
    }
}
