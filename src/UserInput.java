package src;

public class UserInput implements Data {
    private String stringInput;

    public UserInput() {
    }

    public void setStringInput(String stringInput) {
        this.stringInput = stringInput;
    }

    public String getStringInput() {
        return stringInput;
    }

    @Override
    public int countWords() {
        return stringInput.split(" ").length;
    }
}
