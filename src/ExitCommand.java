package src;

public class ExitCommand implements Data {
    public static final ExitCommand EXIT = new ExitCommand();

    private ExitCommand() {
    }

    /**
     * @return command type of inputted by user
     */
    @Override
    public CommandTypes get() {
        return CommandTypes.EXIT;
    }
}
