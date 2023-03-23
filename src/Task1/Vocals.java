package Task1;

import java.util.ArrayList;
import java.util.List;

public class Vocals extends PrintBase {
    static ArrayList<Character> myCharacters = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u', 'y'));

    public static boolean isType(char ch) {
        return myCharacters.contains(ch);
    }
}
