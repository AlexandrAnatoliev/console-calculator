package src;

/**
 * Represents an immutable data
 */
public interface Data {
    UserCommands get();

    static Data of(UserInput input) {
        if (input.getStringInput().contains("help")) {
            return HelpCommand.HELP;
        }
        if (input.getStringInput().contains("exit")) {
            return ExitCommand.EXIT;
        }
        return new MathExpression(input);
    }
}
