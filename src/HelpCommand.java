package src;

public class HelpCommand implements Data {
    public static final HelpCommand HELP = new HelpCommand();

    private HelpCommand() {
    }

    /**
     * @return command type of inputted by user
     */
    @Override
    public CommandTypes get() {
        return CommandTypes.HELP;
    }

}
