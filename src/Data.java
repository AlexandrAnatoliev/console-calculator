package src;
/**
 * Represents an immutable data
 */
public interface Data {
    /**
     *
     * @return command type of inputted by user
     */
    CommandTypes get();

    /**
     * Parses input data and return data object of need type
     * @param input user input object
     * @return data object of need type
     */
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
