package src;

public class OneWord implements Data{
    private final String command;

    public OneWord(UserInput input) {
        this.command = input.getStringInput();
    }

    public String getCommand() {
        return command;
    }
}
