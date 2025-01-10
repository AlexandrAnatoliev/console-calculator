package src;

public class OneWord implements Data{
    private final String command;

    public OneWord(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
