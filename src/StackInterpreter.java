import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import StackInterpreter.*;

public class StackInterpreter {
    private final Context _context;
    private final LinkedList<StackCommand> _commands = new LinkedList<>();

    public StackInterpreter() {
        _context = new Context();
    }

    public StackInterpreter(Context context) {
        _context = context;
    }

    public void interpret(InputStreamReader commandStream) throws IOException {
        BufferedReader commandReader = new BufferedReader(commandStream);
        String command = commandReader.readLine();
        boolean isEnded;
        while (command != null) {
            command = removeComments(command);

            if (command.isEmpty()) {
                command = commandReader.readLine();
                continue;
            }

            String[] tokens = command.split(" ");
            LinkedList<StackCommand> args = new LinkedList<>();
            isEnded = readCommands(args, tokens);

            if (!args.isEmpty())
                _commands.add(args.removeLast());
            if (isEnded)
                break;

            command = commandReader.readLine();
            args.clear();
        }

        executeCommands();
    }

    private void executeCommands() {
        for (StackCommand command: _commands) {
            command.execute(_context);
        }
    }

    private static boolean readCommands(LinkedList<StackCommand> args, String[] tokens) {
        for (int i = tokens.length - 1; i >= 0; i--) {
            switch (tokens[i]) {
                case "PUSH":
                    args.add(new PushCommand(args));
                    break;
                case "POP":
                    args.add(new PopCommand());
                    break;
                case "+":
                    args.add(new PlusCommand());
                    break;
                case "-":
                    args.add(new MinusCommand());
                    break;
                case "*":
                    args.add(new MultipleCommand());
                    break;
                case "/":
                    args.add(new DivideCommand());
                    break;
                case "SQRT":
                    args.add(new SqrtCommand());
                    break;
                case "PRINT":
                    args.add(new PrintCommand());
                    break;
                case "DEFINE":
                    args.add(new DefineCommand(args));
                    break;
                case "END":
                    return true;
                default:
                    try {
                        double number = Double.parseDouble(tokens[i]);
                        args.add(new NumberCommand(number));
                    }
                    catch (NumberFormatException e) {
                        args.add(new ParameterCommand(tokens[i]));
                    }
                    break;
            }
        }
        return false;
    }

    private static String removeComments(String command) {
        if (!command.contains("#"))
            return command;

        return command.substring(0, command.indexOf("#"));
    }
}
