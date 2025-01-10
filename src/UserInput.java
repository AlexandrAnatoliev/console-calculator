package src;

public class UserInput {
    private final String stringInput;

    public UserInput(String stringInput) {
        this.stringInput = stringInput;
    }

    public String getStringInput() {
        return stringInput;
    }

    /**
     * @return a number of words entered by user
     */
    public int countWords() {
        return stringInput.split(" ").length;
    }
}
