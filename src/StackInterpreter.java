import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import StackInterpreter.*;

public class StackInterpreter {
    private Context _context;
    private LinkedList<StackCommand> _commands;

    public StackInterpreter() {
        _context = new Context();
    }

    public StackInterpreter(Context context) {
        _context = context;
    }

    public void interpret(InputStreamReader commandStream) throws IOException {
        BufferedReader commandReader = new BufferedReader(commandStream);
        String command = commandReader.readLine();
        while (command != null) {
            String[] tokens = command.split(" ");
            for (String token: tokens) {
                switch (token) {
                    case "PUSH":
                        _commands.add(new PushCommand());
                    case "POP":
                        _commands.add(new PopCommand());
                }
            }
        }
    }
}
