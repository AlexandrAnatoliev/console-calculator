package src;

public class HelpCommand implements Data {
    public static final HelpCommand HELP = new HelpCommand();

    private HelpCommand() {
    }

    @Override
    public CommandTypes get() {
        return CommandTypes.HELP;
    }

}
