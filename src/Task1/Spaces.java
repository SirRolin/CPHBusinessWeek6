package Task1;

import java.util.ArrayList;
import java.util.List;

public class Spaces extends PrintBase {
    static ArrayList<Character> myCharacters = new ArrayList<>(List.of(' '));

    public static boolean isType(char ch) {
        return myCharacters.contains(ch);
    }
}
