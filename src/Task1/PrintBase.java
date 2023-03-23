package Task1;

public abstract class PrintBase {
    public static void printNextChar(String line){
        char next = line.charAt(0);
        if(Vocals.isType(next)) Vocals.print(next);
        if(Consonants.isType(next)) Consonants.print(next);
        if(Spaces.isType(next)) Spaces.print(next);
        if(line.length()>1) printNextChar(line.substring(1)); else print('\n');
    }
    public static void print(char ch){
        System.out.print(ch);
    }
}
