package Task1;

import java.util.ArrayList;
import java.util.List;

public class Consonants extends PrintBase {
    static ArrayList<Character> myCharacters = new ArrayList<>(List.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'));

    public static boolean isType(char ch) {
        return myCharacters.contains(ch);
    }
}
