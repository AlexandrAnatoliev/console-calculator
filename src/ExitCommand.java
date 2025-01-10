package src;

public class ExitCommand implements Data {
    public static final ExitCommand EXIT = new ExitCommand();

    private ExitCommand() {
    }

    @Override
    public CommandTypes get() {
        return CommandTypes.EXIT;
    }
}
