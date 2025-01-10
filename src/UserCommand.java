package src;

public class UserCommand {
    private final String command;

    public UserCommand(UserInput input) {
        this.command = input.getStringInput();
    }

    public String getCommand() {
        return command;
    }
}
