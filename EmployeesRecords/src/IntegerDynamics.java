import java.sql.SQLOutput;
import java.util.*;
public class IntegerDynamics {
    private int minimumAcceptedValue;
    private int maximumAcceptedValue;
    private String promptString;
    public IntegerDynamics(int minimumAcceptedValue, int maximumAcceptedValue, String promptString) {
        this.maximumAcceptedValue = maximumAcceptedValue;
        this.minimumAcceptedValue = minimumAcceptedValue;
        this.promptString = promptString;
    }
    public void setInputParameters(int minimumAcceptedValue, int maximumAcceptedValue, String promptString) {
        this.maximumAcceptedValue = maximumAcceptedValue;
        this.minimumAcceptedValue = minimumAcceptedValue;
        this.promptString = promptString;
    }
    public int getValue() {
        Scanner sc = new Scanner(System.in);
    }
}