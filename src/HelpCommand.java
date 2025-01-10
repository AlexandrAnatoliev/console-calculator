package src;

public class HelpCommand implements Data {
    public static final HelpCommand HELP = new HelpCommand();

    private HelpCommand() {
    }

    @Override
    public UserCommands get() {
        return UserCommands.HELP;
    }

}
