package src;

public class UserCommand implements Data{
    private final String command;

    public UserCommand(UserInput input) {
        this.command = input.getStringInput();
    }

    public String getCommand() {
        return command;
    }
}
